/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author Álvaro Parras
 */
public class ChatMeeting implements Event{
    
    private GregorianCalendar schedule;
    private ArrayList<String> participates;
    
    public ChatMeeting(GregorianCalendar schedule, ArrayList<String> users) {
        this.schedule = schedule;
        this.participates = users;
    }

    public ArrayList<String> getParticipates() {
        return participates;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");
        return sdf.format(schedule.getTime()); //To change body of generated methods, choose Tools | Templates.
    }
        
    public void start(){
        
    }
    public void stop(){
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChatMeeting other = (ChatMeeting) obj;
        if (!Objects.equals(this.schedule, other.schedule)) {
            return false;
        }
        return true;
    }

    @Override
    public GregorianCalendar getSchedule() {
        return schedule;
    }

    public void setSchedule(GregorianCalendar schedule) {
        this.schedule = schedule;    }

    @Override
    public int compareTo(Object t) {
        Event event = (Event) t;
        return schedule.compareTo(event.getSchedule());
    }


}
