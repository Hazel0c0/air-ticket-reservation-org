package dongwoo;


import yougeun.Client.Client;
import yougeun.Client.Gender;
import yougeun.Utility;

import java.util.Scanner;

import static yougeun.Utility.input;

public class ClientView {



    Scanner sc;
    ClientRepository cr = new ClientRepository();




    /**
     * 초기 메인 화면을 출력
     */
    void mainView() {
        System.out.println("\n### 삼조 에어라인에 오신걸 환영합니다~~ ###");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 로그인");
        System.out.println("* 0. 프로그램 종료하기");
        System.out.println("=============================");
    }

    void viewProcess() {

        while (true) {
            mainView();
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    signUp();
                    break;
                case "2":
//                    login();
                    break;
                case "0":
                    String answer = input("# 정말로 종료합니까? [y/n] : ");
                    if (answer.toLowerCase().charAt(0) == 'y') {
                        System.out.println("# 프로그램을 종료합니다.");
                        System.exit(0);
                    } else {
                        continue;
                    }
                    break;
                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
            }
        }


    }

    public void signUp() {
        //이름입력
        String name = Utility.input("이름 : ");
        //성별확인
        while (true) {
            int genderNum = Integer.parseInt(Utility.input("성별 : 1.남자 2.여자 "));
            Gender gender = cr.genderCheck(genderNum);
            if (gender.equals(Gender.MALE) || gender.equals(Gender.FEMALE)) {
                break;
            }
        }

        //핸드폰번호입력
        while (true) {
            String userPhone = Utility.input("휴대폰번호 : ");
            cr.phoneCheck(userPhone);
            cr.phoneCheckNum(userPhone);
        }
        //아이디입력
        while (true) {
            String id = Utility.input("아이디 : ");
            boolean flagId = cr.idCheck(id);
            if (flagId == true) {
                System.out.println("사용할 수 있는 아이디입니다");
                System.out.println("아이디 확인");

                break;
            }
        }
        //비밀번호 입력
        while (true) {
            String pw = Utility.input("비밀번호 : ");
            String pw2 = Utility.input("비밀번호확인 : ");
            boolean flagPw = cr.pwCheck(pw, pw2);
            if (flagPw == true) {
                System.out.println("비밀번호 확인");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다 재입력하세요");
            }
        }



        while (true) {
            int age = Integer.parseInt(Utility.input("나이 : "));
            boolean flagAge = cr.ageCheck(age);
            if (flagAge == true) break;
            else System.out.println("0~150살 사이 값을 입력하세요");
        }

        Client client=new
        cr.clientList.add(client);

    }
}
