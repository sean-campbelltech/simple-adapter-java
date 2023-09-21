package com.campbelltech;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class XmlParserImpl implements XmlParser {
    @Override
    public Object parse(String data) {
        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(Object.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return jaxbUnmarshaller.unmarshal(new StringReader(data));
        }
        catch (JAXBException e)
        {
            throw new RuntimeException("Error while parsing XML to object");
        }
    }

    @Override
    public String convertToXml(Object obj) {
        return null;
    }
}
