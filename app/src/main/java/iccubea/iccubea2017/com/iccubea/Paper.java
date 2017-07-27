package iccubea.iccubea2017.com.iccubea;

/**
 * Created by Ankush on 22-07-2017.
 */

public class Paper {
    int pid;
    String author, date, location, track, time;


    public Paper()
    {
        pid = -1;
        author = date = location = track = "NA";
    }

    public Paper(int pid, String author, String date, String location, String track, String time) {
        this.pid = pid;
        this.author = author;
        this.date = date;
        this.location = location;
        this.track = track;
        this.time = time;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
