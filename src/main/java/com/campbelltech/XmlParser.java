package com.campbelltech;

// Adaptee
public interface XmlParser<T> {
    T parse(String data);
    String convertToXml(T obj);
}