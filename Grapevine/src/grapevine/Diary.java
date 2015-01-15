/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.util.ArrayList;

/**
 *
 * @author Álvaro Parras
 */
public class Diary {
    
    private ArrayList <User> contacts;
    private ArrayList <Event> events;
    
    public Diary (){
        contacts = new ArrayList<>();
        events = new ArrayList<>();
    }
    public Diary (ArrayList <User> contacts, ArrayList <Event> events) {
        this.contacts = contacts;
        this.events = events;
    }
    
    public ArrayList <User> getContacts() {
        return contacts;
    }
    
    public ArrayList <Event> getEvents() {
        return events;
    }

    public void setContacts(ArrayList<User> contacts) {
        this.contacts = contacts;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }
    
    public boolean addContact (User contact) {
        if(contacts.contains(contact)){
            return false;
        }
        return contacts.add(contact);
    }
    
    public boolean removeContact (User oldContact){
        return contacts.remove(oldContact);
    }
    
    public void addEvent (Event ev){
        events.add(ev);
    }
    
    
}
