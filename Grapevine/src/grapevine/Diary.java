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
    
    private ArrayList <User> users;
    private ArrayList <Event> events;
    
    public Diary (ArrayList <User> users, ArrayList <Event> events) {
        if (users == null) {
            this.users = new ArrayList();
        }
        else {
            this.users = users;
        }
        if (events == null) {
            this.events = new ArrayList();
        }
        else {
            this.events = events;
        }
    }
    
    public ArrayList <User> getUsers() {
        return users;
    }
    
    public ArrayList <Event> getEvents() {
        return events;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }
    
    public void addContact (User us) {
        users.add(us);
        us.setDiary(this);
    }
    
    public void removeContact (User us2){
        if (users != null) {
            for (User u: users) {
                if (u.getIp().equals(us2.getIp())) {
                    users.remove(u);
                }
                else{
                    System.out.println("El contacto no esta en la agenda.");
                }
            }
        }
        else{
            System.out.println("La agenda esta vacia");
        }
    }
    
    public void addEvent (Event ev){
        events.add(ev);
        ev.set
    }
    
    
}
