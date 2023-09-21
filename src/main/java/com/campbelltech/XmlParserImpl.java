package com.campbelltech;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;
import java.io.StringWriter;

public class XmlParserImpl<T> implements XmlParser<T> {

    private final Class<T> type;

    public XmlParserImpl(Class<T> type) {
        this.type = type;
    }

    @Override
    public T parse(String data) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(type);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return (T) jaxbUnmarshaller.unmarshal(new StringReader(data));
        } catch (JAXBException e) {
            throw new RuntimeException("Error while parsing XML to object", e);
        }
    }

    @Override
    public String convertToXml(T obj) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Note.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter writer = new StringWriter();
            marshaller.marshal(obj, writer);
            return writer.toString();
        } catch (JAXBException e) {
            throw new RuntimeException("Error while converting object to XML", e);
        }
    }
}
