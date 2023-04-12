package yougeun.Client;

import jiwon.enumset.Way;


public class Ticket {
    private String from;    // 출발지
    private String destination;  // 도착지
    private int go;   // 탑승일
    private int comeback; //도착일
    private Way way; // 왕복 & 편도
    private int passenger; // 총 인원

    public Ticket() {
    }

    public Ticket(String from, String to, int date, Way way, int personnal, int go, int comeback, int passenger) {
        this.from = from;
        this.destination = to;
        this.go = go;
        this.comeback = comeback;
        this.passenger = passenger;
        this.way = way;
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getGo() {
        return go;
    }

    public void setGo(int go) {
        this.go = go;
    }

    public int getComeback() {
        return comeback;
    }

    public void setComeback(int comeback) {
        this.comeback = comeback;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }
}

