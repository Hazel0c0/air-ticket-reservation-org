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


    //이름확인
    public boolean nameCheck(String name){
        if (name.length()>=2&&name.length()<=5){
            return true;
        }
        return false;
    }

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





    //도메인 배열 생성

    String[] domainName = new String[4];
    public String emailDomain(int email2) {

        String naver = "naver.com";
        String daum = "daum.com";
        String kakao = "kako.co.kr";
        String domain = sc.nextLine();
        domainName[0]=naver;
        domainName[1]=daum;
        domainName[2]=kakao;
        domainName[3]=domain;

        return domainName[email2-1];

        }

        //도메인 입력 확인

    public boolean domainPush(int email2){
           if (email2>0&&email2<5){
               return true;
        }
                return false;
    }


//    주소입력
    public boolean addressCheck(String location){
        System.out.println(location);
        String answerNum = Utility.input("입력한주소가맞으신가요?\n1.네 2.아니오");
        switch (answerNum){
            case "1": return true;
        }
        return false;
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
        System.out.printf("인증번호 : %06d\n", randomNum);
        return randomNum;

    }

    //인증번호 확인
    public boolean phoneCheckNum(int phoneCheckNum, int randomNum){

        if(phoneCheckNum==randomNum){
            return true;
        }
        return false;
    }


    //가입 아이디 중복 확인
    public boolean idCheck(String id) {
        boolean flagId = false;
        for (int i = 0; i < clientList.size(); i++) {
            if (clientList.get(i).getId().equals(id)) {
                flagId= true;
                break;
            }
        }
        return flagId;
    }

    //가입 아이디 글자수  제한
    public boolean idLength(String id){
        if(id.length()>=6&&id.length()<=12) {
            return true;
        }else {
            return false;

        }
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
    public boolean checkIdSignUp(String writeId){
        for (int i = 0; i <clientList.size() ; i++) {
            if (clientList.get(i).getId().equals(writeId)){
                    return true;
        }else {
                return false;
            }


        }

        return false;
    }
    public boolean checkPwSignUp(String writePw){
        for (int i = 0; i <clientList.size() ; i++) {
            if (clientList.get(i).getPassword().equals(writePw)){
                    return true;
        }else {
                return false;
            }


        }

        return false;
    }

}