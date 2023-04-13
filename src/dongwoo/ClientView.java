package dongwoo;


import dongwoo.Client.*;
import yougeun.Client.Gender;
import yougeun.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static yougeun.Utility.*;
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
                    login();
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
        String name;
        while (true) {
            name = input("이름 : ");
            boolean flagName = cr.nameCheck(name);
            if (flagName == true) {
                break;
            } else {
                System.out.println("이름을 다시 입력해주세요 (2~5글자)");
            }
        }


        //성별확인
        Gender gender;
        while (true) {
            int genderNum = Integer.parseInt(input("성별 : 1.남자 2.여자 "));
            gender = cr.genderCheck(genderNum);
            if (gender.equals(Gender.MALE) || gender.equals(Gender.FEMALE)) {
                break;
            } else {
                System.out.println("성별을 다시 입력해주세요");
            }
        }

        //핸드폰번호입력
        String userPhone;
        while (true) {
            userPhone = input("휴대폰번호(-제외 숫자만 입력하세요) : ");
            boolean phoneCheck = cr.phoneCheck(userPhone);
            if (phoneCheck == true) {
                break;
            } else {
                System.out.println("재입력하세요 10~11자리");
            }
        }


        //인증번호 확인
        while (true) {
            int radomNum = cr.randomNum();

            int phoneCheckNum = Integer.parseInt(input("인증번호입력 : "));
            boolean flagPhonCheckNum = cr.phoneCheckNum(phoneCheckNum, radomNum);
            if (flagPhonCheckNum == true)
                break;
        }


        //개인메일계정 입력
        String email = null;
        while (true) {
            String email1 = input("@앞 메일 주소를 입력해주세요 ex)myblog0419 : ");
            String flagEmailWrite = cr.emailWrite(email1);
            if (flagEmailWrite == email1) {
                //도메인입력
                String s = input("메일도메인 : 1.네이버 2.다음 3.카카오 4.기타(직접입력)");
                int email2 = Integer.parseInt(s);
                String emailDomainResult = cr.emailDomain(email2);
                boolean flagDomain = cr.domainPush(email2);
                if (flagDomain == true) {
                    email = email1 + "@" + emailDomainResult;
                    System.out.println(email);
                    break;
                }
            } else {
                System.out.println("메일을 다시 입력하세요 6~12자리");
            }

        }

        //주소입력
        String location = null;
        while (true) {
            location = input("주소를 입력하세요 ex) xx시 xx구 xx동 + 기타주소");
            boolean flagLocation = cr.addressCheck(location);
            if (flagLocation == true) {
                break;
            } else {
                System.out.println("다시입력하세요");
            }
        }


        //아이디입력
        String id;
            while (true) {
                id = input("아이디 : ");
                boolean flagId = cr.idCheck(id);
                boolean idLength = cr.idLength(id);

                if (flagId == true && idLength == true) {
                    System.out.println("사용할 수 있는 아이디입니다");
                    System.out.println("아이디 확인");
                    break;

                } else {
                    System.out.println("이미 가입된 아이디 또는 6~12자리 사이 글자 입력해주세요");

                }

            }

            //비밀번호 입력
            String pw;
            while (true) {
                pw = input("비밀번호 : ");
                String pw2 = input("비밀번호확인 : ");
                boolean flagPw = cr.pwCheck(pw, pw2);
                if (flagPw == true) {
                    System.out.println("비밀번호 확인");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다 재입력하세요");
                }

            }
            //나이입력
            int age;
            while (true) {
                age = Integer.parseInt(input("나이 : "));
                boolean flagAge = cr.ageCheck(age);
                if (flagAge == true) {
                    System.out.println("로그인 완료");
                    break;
                } else {
                    System.out.println("0~150살 사이 값을 입력하세요");
                }
            }

            Client client = new Client(name, gender, userPhone, email, location, id, pw, age);
            cr.clientList.add(client);
            System.out.println(cr.clientList.get(0).getUserName());
            System.out.println(cr.clientList.get(0).getGender());
            System.out.println(cr.clientList.get(0).getUserPhone());
            System.out.println(cr.clientList.get(0).getEmail());
            System.out.println(cr.clientList.get(0).getLocation());
            System.out.println(cr.clientList.get(0).getId());
            System.out.println(cr.clientList.get(0).getPassword());

        }


    //로그인화면
    private void login() {
        //아이디로그인
        while (true) {
            String writeId = input("아이디를 입력하세요 : ");
            boolean flagIdSignUp = cr.checkIdSignUp(writeId);
            if (flagIdSignUp == true) {
                System.out.println("Id 확인");
                break;
            }else {
                System.out.println("존재하지 않는 아이디입니다. 다시 입력해주세요");
            }
        }
        //비밀번호 로그인
        while (true) {
            String writePw = input("비밀번호를 입력하세요 : ");
            boolean flagPwSignUp = cr.checkPwSignUp(writePw);
            if (flagPwSignUp == true) {
                System.out.println("Pw 확인");
                System.out.println("로그인완료");
                break;
            }else {
                System.out.println("존재하지 않는 비밀번호입니다. 다시 입력해주세요");

            }
        }

    }

}
