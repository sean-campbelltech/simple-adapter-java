package com.campbelltech;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Note {
    private String to;
    private String from;
    private String heading;
    private String body;

    @XmlElement
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @XmlElement
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @XmlElement
    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    @XmlElement
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}