/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author Álvaro Parras
 */
public class ChatMessage implements Serializable{
    private String text;
    private GregorianCalendar date;

    public ChatMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }
    
    
    
}
