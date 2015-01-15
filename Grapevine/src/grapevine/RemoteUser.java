/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.rmi.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author S.Valeror
 */
public interface RemoteUser extends Remote {
    
    public abstract void refreshIP () throws java.rmi.RemoteException;
    public abstract void createEvent (GregorianCalendar schedule, ArrayList<User> users) throws java.rmi.RemoteException;
    public abstract void createEvent (GregorianCalendar schedule) throws java.rmi.RemoteException;
    public abstract void sendRequest (GregorianCalendar schedule, User users) throws java.rmi.RemoteException;
    public abstract void checkRequest (GregorianCalendar schedule) throws java.rmi.RemoteException;
    
}
