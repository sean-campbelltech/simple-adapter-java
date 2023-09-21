package com.campbelltech;

public interface XmlParser {
    Object parse(String data);
    String convertToXml(Object obj);
}
