package com.campbelltech;

// Client
public class Main {
    public static void main(String[] args) {
        // Multiline string available from Java 15
        String someXml = """
                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                       <note>
                         <to>John</to>
                         <from>Jane</from>
                         <heading>Reminder</heading>
                         <body>Don't forget to pick me up at work!</body>
                       </note>
                """;
        JsonParser<Note> parser = new XmlToJsonAdapter<>(Note.class);
        Note note = parser.parse(someXml);
        System.out.println(parser.convertToJson(note));
    }
}