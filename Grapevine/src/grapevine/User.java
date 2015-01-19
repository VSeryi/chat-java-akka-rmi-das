package grapevine;

import akka.actor.UntypedActor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class User extends UntypedActor implements Serializable {

    private String username;
    private int port;
    private Diary diary;
    private Grapevine myGUI;

    public User(User user, Grapevine myGUI) {
        this.username = user.getUsername();
        this.port = user.getPort();
        this.diary = new Diary(user.getDiary());
        this.myGUI = myGUI;
        this.myGUI.setMyUser(this);
    }

    public User(String username, int port, Grapevine myGUI) {
        this.username = username;
        this.port = port;
        this.diary = new Diary();
        this.myGUI = myGUI;
        this.myGUI.setMyUser(this);
    }

    public User(String username, Diary diary, int port, Grapevine myGUI) {
        this.username = username;
        this.port = port;
        this.diary = diary;
        this.myGUI = myGUI;
        this.myGUI.setMyUser(this);
    }

    public String getUsername() {
        return username;
    }

    public int getPort() {
        return port;
    }

    public Diary getDiary() {
        return diary;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }

    @Override
    public void onReceive(Object o) throws Exception {
        if (o instanceof Event) {
            if (!(diary.addEvent((Event) o))) {
                getSender().tell(new RejectedMeeting((Event) o), getSelf());
            }
        } else if (o instanceof RejectedMeeting) {
            diary.removeEvent(((RejectedMeeting) o).getEvent());
        } else if (o instanceof ChatMessage) {
            myGUI.writeChat(getSender().path().name(), (ChatMessage) o);
        } else {
            unhandled(o);
        }
    }

}
