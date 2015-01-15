/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package grapevine;

import java.net.Inet4Address;

/**
 *
 * @author verde
 */
public class UserBackup {
    
    private Inet4Address ip;
    private Diary diary;

    public Inet4Address getIp() {
        return ip;
    }

    public Diary getDiary() {
        return diary;
    }

    public void setIp(Inet4Address ip) {
        this.ip = ip;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }
    
    
}
