package com.campbelltech;

// Target
public interface JsonParser<T> {
    T parse(String data);
    String convertToJson(T obj);
}
