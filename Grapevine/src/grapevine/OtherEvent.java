/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;

public class OtherEvent implements Event {

    private GregorianCalendar schedule;

    @Override
    public GregorianCalendar getSchedule() {
        return schedule;

    }

    public void setSchedule(GregorianCalendar schedule) {
        this.schedule = schedule;

    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm");
        return sdf.format(schedule.getTime()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Object t) {
        Event event = (Event) t;
        return schedule.compareTo(event.getSchedule());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OtherEvent other = (OtherEvent) obj;
        if (!Objects.equals(this.schedule, other.schedule)) {
            return false;
        }
        return true;
    }
}
