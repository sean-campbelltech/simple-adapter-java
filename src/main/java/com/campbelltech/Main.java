package com.campbelltech;

// Client
public class Main {
    public static void main(String[] args) {
        // Multiline string available from Java 15
        String someXml = """
                <note>
                   <to>John</to>
                   <from>Jane</from>
                   <heading>Reminder</heading>
                   <body>Remember to pick up the kids from school!</body>
                </note>
                """;
        JsonParser parser = new XmlToJsonAdapter();
        Object obj = parser.parse(someXml);
        System.out.println(parser.convertToJson(obj));
    }
}