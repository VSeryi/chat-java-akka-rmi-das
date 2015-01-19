/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.SecureRandom;

/**
 *
 * @author verde
 */
public class Server {

    private static final String path = System.getenv("APPDATA") + File.separator + "grapevine" + File.separator;
    private SecureRandom idMeeting = new SecureRandom();

    public static String getPath() {
        return path;
    }

    public SecureRandom getIdMeeting() {
        return idMeeting;
    }

    public void setIdMeeting(SecureRandom idMeeting) {
        this.idMeeting = idMeeting;
    }

    public static boolean checkUser(String user) {
        return new File(path + user).exists();
    }

    public static void updateBackup(String user, UserBackup backup) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path + user + File.separator + "backup"));
            out.writeObject(backup);
            out.close();
        } catch (Exception ex) {
        }
    }

    public static void updateDiary(String user, Diary diary) {
        UserBackup backup = getUserBackup(user);
        backup.setDiary(diary);
        updateBackup(user,backup);
    }
    
    public static void updatePort(String user, int port) {
        UserBackup backup = getUserBackup(user);
        backup.setPort(port);
        updateBackup(user,backup);
    }

    public static void createUser(String user, int port) {
        UserBackup newBackup = new UserBackup(port);
        new File(path + user).mkdir();
        updateBackup(user, newBackup);
    }

    private static UserBackup getUserBackup(String username) {
        UserBackup backup = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(path + username + File.separator + "backup"));
            backup = (UserBackup) in.readObject();
            in.close();
        } catch (Exception ex) {
        }
        return backup;
    }

    public static Diary getDiary(String username) {
        return getUserBackup(username).getDiary();
    }
    
    public static int getPort(String username) {
        return getUserBackup(username).getPort();
    }
}
