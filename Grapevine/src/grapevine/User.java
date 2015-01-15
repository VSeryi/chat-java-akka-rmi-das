/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.io.Serializable;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Álvaro Parras
 */
public class User  extends UnicastRemoteObject implements RemoteUser{
    private String username;
    private Inet4Address ip; 
    private Diary diary;
    private String pene;
    
    public User (String username, Inet4Address ip) {//Diary diary) {
        this.username = username;
        this.ip = ip;
        this.diary = new Diary();
    }

    public String getUsername() {
        return username;
    }

    public Inet4Address getIp() {
        return ip;
    }
    
    public Diary getDiary() {
        return diary;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setIp(Inet4Address ip) {
        this.ip = ip;
    }
    
    public void setDiary(Diary diary) {
        this.diary = diary;
    }
    
    public void refreshIP (){
        
    };
    public void createEvent (GregorianCalendar schedule, ArrayList<User> users){
        
    };
    public void createEvent (GregorianCalendar schedule){
        
    };
    public void sendRequest (GregorianCalendar schedule, User users){
        
    };
    public void checkRequest (GregorianCalendar schedule) {
        
    };

    
}
