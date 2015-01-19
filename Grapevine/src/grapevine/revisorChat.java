/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.util.TimerTask;

/**
 *
 * @author S.Valeror
 */
public class revisorChat extends TimerTask{
    private Grapevine myProgram;

    public revisorChat(Grapevine myProgram) {
        this.myProgram = myProgram;
    }

    @Override
    public void run() {
        myProgram.closeChat();
    }
}
