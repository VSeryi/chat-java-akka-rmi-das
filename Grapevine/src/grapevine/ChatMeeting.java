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
public class ChatMeeting implements Event{
    
    private GregorianCalendar schedule;
        
    public void start(){
        
    }
    public void stop(){
        
    }

    @Override
    public GregorianCalendar getSchedule() {
        return schedule;
    }

    @Override
    public void setSchedule(GregorianCalendar schedule) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
