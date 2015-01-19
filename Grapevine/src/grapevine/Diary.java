/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.util.ArrayList;
import java.io.Serializable;

/**
 *
 * @author Álvaro Parras
 */
public class Diary implements Serializable {
    
    private ArrayList<String> contacts;
    private ArrayList<ChatMeeting> meetings;
    private ArrayList<OtherEvent> otherEvent;
    
    public Diary() {
        contacts = new ArrayList<>();
        meetings = new ArrayList<>();
        otherEvent = new ArrayList<>();
    }

    Diary(Diary diary) {
        contacts = new ArrayList<>(diary.getContacts());
        meetings = new ArrayList<>(diary.getMeetings());
        otherEvent = new ArrayList<>(diary.getOtherEvent());
    }
    
    public ArrayList<String> getContacts() {
        return contacts;
    }
    
    public void setContacts(ArrayList<String> contacts) {
        this.contacts = contacts;
    }
    
    public ArrayList<ChatMeeting> getMeetings() {
        return meetings;
    }
    
    public void setMeetings(ArrayList<ChatMeeting> meetings) {
        this.meetings = meetings;
    }
    
    public ArrayList<OtherEvent> getOtherEvent() {
        return otherEvent;
    }
    
    public void setOtherEvent(ArrayList<OtherEvent> otherEvent) {
        this.otherEvent = otherEvent;
    }
    
    public boolean addContact(String contact) {
        if (contacts.contains(contact)) {
            return false;
        }
        return contacts.add(contact);
    }
    
    public boolean removeContact(String oldContact) {
        return contacts.remove(oldContact);
    }
    
    public boolean addEvent(Event event) {
        if (meetings.contains(event) || otherEvent.contains(event)) {
            return false;
        }
        if (event instanceof ChatMeeting) {
            return meetings.add((ChatMeeting)event);
        } else {
            return otherEvent.add((OtherEvent) event);
        }
    }
    public boolean removeEvent(Event event) {
        if (meetings.contains(event) || otherEvent.contains(event)) {
            return false;
        }
        if (event instanceof ChatMeeting) {
            return meetings.remove((ChatMeeting)event);
        } else {
            return otherEvent.remove((OtherEvent) event);
        }
    }
    
}
