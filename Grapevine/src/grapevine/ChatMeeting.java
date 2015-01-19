/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class ChatMeeting implements Event {

    private GregorianCalendar schedule;
    private ArrayList<String> participantes;

    public ChatMeeting(GregorianCalendar schedule, ArrayList<String> users) {
        this.schedule = schedule;
        this.participantes = users;
    }

    public ArrayList<String> getParticipates() {
        return participantes;
    }

    @Override
    public GregorianCalendar getSchedule() {
        return schedule;
    }

    public void setSchedule(GregorianCalendar schedule) {
        this.schedule = schedule;
    }

    @Override
    public int compareTo(Object t) {
        Event event = (Event) t;
        return schedule.compareTo(event.getSchedule());
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");
        return sdf.format(schedule.getTime()); //To change body of generated methods, choose Tools | Templates.
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
        GregorianCalendar myFinish = (GregorianCalendar) this.schedule.clone();
        myFinish.add(GregorianCalendar.MINUTE, 5);
        if ((this.schedule.compareTo(other.schedule) < 0) && (myFinish.compareTo(other.schedule) > 0)) {
            return false;
        }
        GregorianCalendar otherFinish = (GregorianCalendar) other.schedule.clone();
        otherFinish.add(GregorianCalendar.MINUTE, 5);
        if ((this.schedule.compareTo(other.schedule) > 0) && (this.schedule.compareTo(otherFinish) < 0)) {
            return false;
        }
        return true;
    }

}
