/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.io.Serializable;

public class RejectedMeeting implements Serializable {

    private ChatMeeting event;

    public RejectedMeeting(ChatMeeting event) {
        this.event = event;
    }

    public ChatMeeting getMeeting() {
        return event;
    }

    public void setMeeting(ChatMeeting event) {
        this.event = event;
    }

}
