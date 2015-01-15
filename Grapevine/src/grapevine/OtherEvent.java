/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.util.GregorianCalendar;

/**
 *
 * @author Álvaro Parras
 */
public class OtherEvent implements Event {
    private GregorianCalendar schedule;
    
    @Override
    public GregorianCalendar getSchedule() {
        return schedule;
 
    }

    public void setSchedule(GregorianCalendar schedule) {
        this.schedule = schedule;
        
        
    }
    
}
