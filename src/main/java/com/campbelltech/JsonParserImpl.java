package com.campbelltech;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonParserImpl<T> implements JsonParser<T> {
    private final Class<T> type;
    private final ObjectMapper objectMapper;

    public JsonParserImpl(Class<T> type) {
        this.type = type;
        this.objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    }

    @Override
    public T parse(String data) {
        try {
            return objectMapper.readValue(data, type);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error while parsing JSON to object", e);
        }
    }

    @Override
    public String convertToJson(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error while converting object to JSON", e);
        }
    }
}
