/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.util.Map;


/**
 *
 * @author S.Valeror
 */
public interface RemoteServer {
    public String getIdMeeting() throws java.rmi.RemoteException;;
    public Map<String, UserBackup> getBackup() throws java.rmi.RemoteException;;
}
