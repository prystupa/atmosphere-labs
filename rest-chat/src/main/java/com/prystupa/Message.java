package com.prystupa;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: eprystupa
 * Date: 2/3/13
 * Time: 9:42 AM
 */

@XmlRootElement
public class Message {
    public String author = "";
    public String message = "";

    public Message(){
    }

    public Message(String author, String message) {
        this.author = author;
        this.message = message;
    }
}
