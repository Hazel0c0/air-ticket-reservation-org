package airproject;


// 고객 한명

import day05.member.Gender;

import java.time.LocalDate;

public class Client {

    private String name;
    private String id;
    private String password;
    Gender gender;
    private int age;
    private int point;
    private int money;

    public Client(String name, String id, String password, Gender gender, int age, int point, int money) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.point = point;
        this.money = money;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // 회원가입일
    LocalDate regData;


    // 고객명단


}
