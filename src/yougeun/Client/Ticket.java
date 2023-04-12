package yougeun.Client;

import jiwon.enumset.Way;


public class Ticket {
    private String from;    // 출발지
    private String to;  // 도착지
    private int date;   // 탑승일
    private Way way; // 왕복 & 편도
    private int personnal; // 총 인원

    public Ticket(String from, String to, int date, Way way, int personnal) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.way = way;
        this.personnal = personnal;
    }

    public String getFrom() {
        return from;
    }

    public Way getWay() {
        return way;
    }

    public void setWay(Way way) {
        this.way = way;
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
