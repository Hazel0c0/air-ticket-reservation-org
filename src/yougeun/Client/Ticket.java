package yougeun.Client;


import jiwon.airlineStatus.WAY;

public class Ticket {
    private String from;    // 출발지
    private String to;  // 도착지
    private int date;   // 탑승일
    private WAY way; // 왕복 & 편도
    private int personnal; // 총 인원

    public Ticket(String from, String to, int date, WAY way, int personnal) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.way = way;
        this.personnal = personnal;
    }

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

    public WAY getWay() {
        return way;
    }

    public void setWay(WAY way) {
        this.way = way;
    }

    public int getPersonnal() {
        return personnal;
    }

    public void setPersonnal(int personnal) {
        this.personnal = personnal;
    }
}
