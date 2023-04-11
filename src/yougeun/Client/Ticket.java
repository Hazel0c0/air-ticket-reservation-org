package yougeun.Client;


import jiwon.enumset.Way;

public class Ticket {
    private String from;
    private String to;
    private int date;
    private Way way;
    private int personnal;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }



    public int getPersonnal() {
        return personnal;
    }

    public void setPersonnal(int personnal) {
        this.personnal = personnal;
    }
}
