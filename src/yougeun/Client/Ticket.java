package yougeun.Client;

import jiwon.enumset.Grade;
import jiwon.enumset.Way;

import java.time.LocalDate;


public class Ticket {
    private String from;    // 출발지
    private String destination;  // 도착지
    private LocalDate go;   // 탑승일
    private LocalDate comeback; //도착일
    private Way way; // 왕복 & 편도
    private int passenger; // 총 인원
    private Grade grade; // 좌석 등급
    private boolean isCheckin; // 체크인 여부

    public Grade getGrade() {
        return grade;
    }

    public void setCheckin(boolean checkin) {
        isCheckin = checkin;
    }

    public boolean isCheckin() {
        return isCheckin;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Ticket() {
    }

    public Ticket(String from, String destination, LocalDate go, LocalDate comeback, Way way, int passenger) {
        this.from = from;
        this.destination = destination;
        this.go = go;
        this.comeback = comeback;
        this.way = way;
        this.passenger = passenger;
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

    public LocalDate getGo() {
        return go;
    }

    public void setGo(LocalDate go) {
        this.go = go;
    }

    public LocalDate getComeback() {
        return comeback;
    }

    public void setComeback(LocalDate comeback) {
        this.comeback = comeback;
    }

    public int getPassenger() {
        return passenger;

    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }
}

