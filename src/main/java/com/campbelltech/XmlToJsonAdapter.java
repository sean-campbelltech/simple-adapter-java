package com.campbelltech;

// Adapter -> Converts the XmlParser interface to the JsonParser interface
public class XmlToJsonAdapter<T> implements JsonParser<T> {
    private final Class<T> type;

    public XmlToJsonAdapter(Class<T> type) {
        this.type = type;
    }

    @Override
    public T parse(String data) {
        XmlParser<T> xmlParser = new XmlParserImpl<>(type);
        return xmlParser.parse(data);
    }

    @Override
    public String convertToJson(T obj) {
        JsonParser<T> jsonParser = new JsonParserImpl<>(type);
        return jsonParser.convertToJson(obj);
    }
}
