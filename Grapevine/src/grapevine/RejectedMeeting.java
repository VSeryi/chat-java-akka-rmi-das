/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.io.Serializable;

/**
 *
 * @author S.Valeror
 */
public class RejectedMeeting implements Serializable{
    private Event event;

    public RejectedMeeting(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
    
}
