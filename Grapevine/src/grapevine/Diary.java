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

    public ArrayList<ChatMeeting> getMeetings() {
        return meetings;
    }

    public ArrayList<OtherEvent> getOtherEvent() {
        return otherEvent;
    }

    public void setContacts(ArrayList<String> contacts) {
        this.contacts = contacts;
    }

    public void setMeetings(ArrayList<ChatMeeting> meetings) {
        this.meetings = meetings;
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

    public boolean addMeeting(ChatMeeting event) {
        if (meetings.contains(event)) {
            return false;
        }
        return meetings.add(event);
    }

    public boolean addOtherEvent(OtherEvent event) {
        if (otherEvent.contains(event)) {
            return false;
        }
        return otherEvent.add((OtherEvent) event);
    }

    public boolean removeMeeting(ChatMeeting event) {
        if (meetings.contains(event)) {
            return false;
        }
        return meetings.remove(event);
    }

    public boolean removeOtherEvent(OtherEvent event) {
        if (otherEvent.contains(event)) {
            return false;
        }
        return otherEvent.remove(event);
    }
}
