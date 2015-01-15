/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.net.Inet4Address;
import java.rmi.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author S.Valeror
 */
public interface RemoteUser extends Remote  {
    public String getUsername() throws java.rmi.RemoteException;
    public Inet4Address getIp() throws java.rmi.RemoteException;
    public Diary getDiary() throws java.rmi.RemoteException;
    public void refreshIP () throws java.rmi.RemoteException;
    public void createEvent (GregorianCalendar schedule, ArrayList<User> users) throws java.rmi.RemoteException;

    /**
     *
     * @param schedule
     * @throws RemoteException
     */
    public void createEvent (GregorianCalendar schedule) throws java.rmi.RemoteException;
    public void sendRequest (GregorianCalendar schedule, User users) throws java.rmi.RemoteException;
    public void checkRequest (GregorianCalendar schedule) throws java.rmi.RemoteException;
    public void activate () throws java.rmi.RemoteException;
    
}
