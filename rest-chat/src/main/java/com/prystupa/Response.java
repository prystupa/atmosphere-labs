package com.prystupa;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: eprystupa
 * Date: 2/3/13
 * Time: 9:42 AM
 */

@XmlRootElement
public class Response {

    public String text;
    public String author;
    public long time;

    public Response(String author, String text) {
        this.author = author;
        this.text = text;
        this.time = new Date().getTime();
    }

    public Response() {
    }
}
