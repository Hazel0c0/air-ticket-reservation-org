package dongwoo;


import yougeun.Client.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientRepository {

    Client client = new Client();

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

    //휴대폰번호 인증문자
    public boolean phoneCheck(String userPhone){
         if (userPhone.length()==10||userPhone.length()==11){
             return true;
         }else {
             return false;
         }
    }

    //인증번호 전송
    public int phoneCheckNum(String userPhone){

    }


    //아이디 중복 확인
    public boolean idCheck(String id) {
        for (int i = 0; i < clientList.size(); i++) {
            boolean flagId = clientList.get(i).getName().equals(id);
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
    public List<Client> push(String name,String id, String pw,Gender gender, int age){

        clientList.add(name,id,pw,gender,age);
    }
}