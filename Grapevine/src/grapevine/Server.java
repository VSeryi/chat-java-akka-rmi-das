/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package grapevine;

import java.util.Map;

/**
 *
 * @author verde
 */
public class Server {
    
    private String idMeeting;
    private Map <String,UserBackup> backup;

    public String getIdMeeting() {
        return idMeeting;
    }

    public Map<String, UserBackup> getBackup() {
        return backup;
    }

    public void setIdMeeting(String idMeeting) {
        this.idMeeting = idMeeting;
    }

    public void setBackup(Map<String, UserBackup> backup) {
        this.backup = backup;
    }
    
    
    
}
