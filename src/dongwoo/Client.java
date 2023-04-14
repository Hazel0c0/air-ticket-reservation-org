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
    private int age;


    public Client(String userName, Gender gender, String userPhone, String email, String location, String id, String password, int age) {
        this.userName = userName;
        this.gender = gender;
        this.userPhone = userPhone;
        this.email = email;
        this.location = location;
        this.id = id;
        this.password = password;
        this.age = age;
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

    // 회원가입일
    LocalDate regData;


    // 고객명단


}
