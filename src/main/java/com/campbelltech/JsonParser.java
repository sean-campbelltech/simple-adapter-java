package com.campbelltech;

// Target
public interface JsonParser {
    Object parse(String data);
    String convertToJson(Object obj);
}
