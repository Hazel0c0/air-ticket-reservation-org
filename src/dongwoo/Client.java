package dongwoo;


// 고객 한명


import yougeun.Client.Card;
import yougeun.Client.Gender;
import yougeun.Client.Ticket;

import java.time.LocalDate;

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


    public Client(String userName, Gender gender, String userPhone, String email,
                  String location, String id, String password, Card card, Ticket ticket,
                  int point, boolean isAdmin) {
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
        this.isAdmin = isAdmin;
    }

    // 회원가입일
    LocalDate regData;


    // 고객명단


}
