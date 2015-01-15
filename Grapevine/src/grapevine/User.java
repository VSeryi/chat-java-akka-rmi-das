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
    
    public User (String username, Inet4Address ip) throws java.rmi.RemoteException{//Diary diary) {
        this.username = username;
        this.ip = ip;
        this.diary = new Diary();
    }

    @Override
    public String getUsername() throws java.rmi.RemoteException{
        return username;
    }

    @Override
    public Inet4Address getIp() throws java.rmi.RemoteException{
        return ip;
    }
    
    /**
     *
     * @return
     * @throws RemoteException
     */
    @Override
    public Diary getDiary() throws java.rmi.RemoteException{
        return diary;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setIp(Inet4Address ip){
        this.ip = ip;
    }
    
    public void setDiary(Diary diary){
        this.diary = diary;
    }
    
    @Override
    public void refreshIP ()throws java.rmi.RemoteException{
        
    };
    @Override
    public void createEvent (GregorianCalendar schedule, ArrayList<User> users)throws java.rmi.RemoteException{
        
    };
    @Override
    public void createEvent (GregorianCalendar schedule)throws java.rmi.RemoteException{
        
    };
    @Override
    public void sendRequest (GregorianCalendar schedule, User users)throws java.rmi.RemoteException{
        
    };
    @Override
    public void checkRequest (GregorianCalendar schedule) throws java.rmi.RemoteException{
        
    };

    
}
