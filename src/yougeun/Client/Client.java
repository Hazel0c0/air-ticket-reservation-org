package yougeun.Client;

import java.util.ArrayList;

public class Client {
    private String userName;
    private Gender gender;
    private String userPhone;
    private String email;
    private String location;
    private String id;
    private String password;
    private Card card;
    private Ticket ticket;
    private int point;
    private boolean isAdmin;
    private ArrayList<String> couponList;


    public Client(String userName, Gender gender, String userPhone, String email, String location, String id, String password) {
        couponList = new ArrayList<>();
        this.userName = userName;
        this.gender = gender;
        this.userPhone = userPhone;
        this.email = email;
        this.location = location;
        this.id = id;
        this.password = password;
    }

    public ArrayList<String> getCouponList() {
        return couponList;
    }

    public Client(String userName, Gender gender, String userPhone, String email, String location, String id, String password, Card card, int point) {
        couponList = new ArrayList<>();
        this.userName = userName;
        this.gender = gender;
        this.userPhone = userPhone;
        this.email = email;
        this.location = location;
        this.id = id;
        this.password = password;
        this.card = card;
        this.point = point;
    }

    public Client(String userName, Gender gender, String userPhone, String email, String location, String id, String password, boolean isAdmin) {
        couponList = new ArrayList<>();
        this.userName = userName;
        this.gender = gender;
        this.userPhone = userPhone;
        this.email = email;
        this.location = location;
        this.id = id;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public Client(String userName, Gender gender, String userPhone, String email, String location, String id, String password, Card card, Ticket ticket, int point) {
        couponList = new ArrayList<>();
        this.userName = userName;
        this.gender = gender;
        this.userPhone = userPhone;
        this.email = email;
        this.location = location;
        this.id = id;
        this.password = password;
        this.card = card;
        this.ticket = ticket;
        this.point = point;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Client{" +
                "userName='" + userName + '\'' +
                ", gender=" + gender +
                ", userPhone='" + userPhone + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", card=" + card +
                ", ticket=" + ticket +
                ", point=" + point +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
