/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.io.Serializable;

/**
 *
 * @author verde
 */
public class UserBackup implements Serializable {
    
    private int port;
    private Diary diary;
    
    public UserBackup(int port){
        this.port = port;
        diary = new Diary();
    }
    public int getPort() {
        return port;
    }

    public Diary getDiary() {
        return diary;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }

}
