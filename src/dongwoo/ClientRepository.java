package dongwoo;


import yougeun.Client.Gender;
import yougeun.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ClientRepository {



    ClientView clientView;

    Scanner sc = new Scanner(System.in);

    List<Client> clientList = new ArrayList<>();


    //성별확인
    public Gender genderCheck(int genderNum) {
        switch (genderNum) {
            case 1:
                return Gender.MALE;
            case 2:
                return Gender.FEMALE;
        }
        return Gender.NULL;

    }

    //개인메일계정입력
    public String emailWrite(String email1){
        if(email1.length()>=6&&email1.length()<=12){
            return email1;
        }else {
            return "";
        }
    }


    //도메인 입력
    public String emailCheck(String email2){
        String naver="naver.com";
        String daum="daum.com";
        String kakao="kako.co.kr";
        String domain=sc.nextLine();

       switch (email2){
           case "1":
               return naver;
           case "2":
               return daum;
           case "3":
               return kakao;
           case "4":
               return domain;
           default:
               return "다시입력하세요";
       }


    }




    //휴대폰번호 인증문자
    public boolean phoneCheck(String userPhone){
         if (userPhone.length()==10||userPhone.length()==11){
             return true;
         }else {
             return false;
         }
    }




    //인증번호 만드는 함수
    public int randomNum(){
        Random random=new Random();
        int randomNum=random.nextInt(1000000)+0;
        System.out.printf(String.format("인증번호 : %6d\n", randomNum),5);
        return randomNum;

    }

    //인증번호 확인
    public boolean phoneCheckNum(int phoneCheckNum, int randomNum){

        if(phoneCheckNum==randomNum){
            return true;
        }
        return false;
    }


    //아이디 중복 확인
    public boolean idCheck(String id) {
        for (int i = 0; i < clientList.size(); i++) {
            boolean flagId = clientList.get(i).equals(id);    //get.getid수정필요
            if (!flagId == false) {
                System.out.println("중복아이디, 재입력하세요");
            } else {
                return flagId;
            }
        }
        return true;
    }

    //비밀번호 확인
    public boolean pwCheck(String pw, String pw2) {
        if (pw.equals(pw2)) {
            return true;
        } else {
            return false;
        }
    }




    //나이확인
    public boolean ageCheck(int age) {
        if(age>0&&age<150){
            return true;
        }else {
            return false;

        }

    }

    //데이터 회원정보 입력
//    public List<Client> push(String name,String id, String pw,Gender gender, int age){
//
//        clientList.add(name,id,pw,gender,age);
//    }
}