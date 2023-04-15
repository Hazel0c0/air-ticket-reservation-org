package yougeun.Client;


import jiwon.airlineStatus.City;

import jiwon.enumset.Grade;
import jiwon.enumset.Way;

import java.time.LocalDate;


public class Ticket extends City {
  private String from;    // 출발지
  private String destination;  // 도착지
  private LocalDate go;   // 탑승일
  private LocalDate comeback; //도착일
  private Way way; // 왕복 & 편도
  private Grade grade;
  private int passenger; // 총 인원

  private boolean isCheckin; // 체크인 여부
  private int pay;


  public int getPay() {
    return pay;
  }

  public void setPay(int pay) {
    this.pay = pay;
  }

  public void setAll(String from, String destination, LocalDate go, LocalDate comeback, Way way, Grade grade, int passenger, int pay) {
    this.from = from;
    this.destination = destination;
    this.go = go;
    this.comeback = comeback;
    this.way = way;
    this.grade = grade;
    this.passenger = passenger;
    this.pay = pay;

  }

  public void setCheckin(boolean checkin) {
    isCheckin = checkin;
  }

  public boolean isCheckin() {
    return isCheckin;
  }


  public Ticket() {
  }

  public Ticket(String from, String destination, LocalDate go, LocalDate comeback, Way way, Grade grade, int passenger) {
    this.from = from;
    this.destination = destination;
    this.go = go;
    this.comeback = comeback;
    this.way = way;
    this.grade = grade;
    this.passenger = passenger;
  }

  public Ticket(String from, String destination, LocalDate go, LocalDate comeback, Way way, int passenger) {

    this.from = from;
    this.destination = destination;
    this.go = go;
    this.comeback = comeback;
    this.way = way;
    this.passenger = passenger;
  }

  public Grade getGrade() {
    return grade;
  }

  public void setGrade(Grade grade) {
    this.grade = grade;
  }

  public String getFrom() {
    return from;
  }

  public String getWayK() {
    if (way == Way.ROUND_TRIP)
      return "왕복";

    return "편도";
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

  @Override
  public String toString() {
    return "Ticket{" +
        "from='" + from + '\'' +
        ", destination='" + destination + '\'' +
        ", go=" + go +
        ", comeback=" + comeback +
        ", way=" + way +
        ", grade=" + grade +
        ", passenger=" + passenger +
        ", isCheckin=" + isCheckin +
        '}';
  }

}

