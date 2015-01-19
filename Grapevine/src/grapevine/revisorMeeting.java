/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.util.GregorianCalendar;
import java.util.TimerTask;

/**
 *
 * @author S.Valeror
 */
public class revisorMeeting extends TimerTask {

    private User myUser;
    private Grapevine myProgram;

    public revisorMeeting(User myUser, Grapevine myProgram) {
        this.myUser = myUser;
        this.myProgram = myProgram;
    }

    @Override
    public void run() {
        System.out.println("Checkeando");
        GregorianCalendar now = new GregorianCalendar();
        for (ChatMeeting event : myUser.getDiary().getMeetings()) {
            if (event.getSchedule().compareTo(now) < 1) {
                myUser.getDiary().removeMeeting(event);
                myProgram.setMyMeeting((ChatMeeting) event);
                myProgram.showChat();
            }
        }

    }

}
