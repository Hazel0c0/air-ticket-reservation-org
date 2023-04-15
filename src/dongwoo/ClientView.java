package dongwoo;


import yougeun.Client.Client;
import yougeun.Client.Gender;

import java.util.Scanner;

import static yougeun.Utility.*;

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
        System.out.println("* 3. 아이디찾기");
        System.out.println("* 4. 비밀번호찾기");
        System.out.println("* 0. 프로그램 종료하기");
        System.out.println("=============================");
    }

    public Client viewProcess() {

        while (true) {
            mainView();
            String menuNum = input("");

            switch (menuNum) {
                case "1":
                    signUp();
                    break;
                case "2":
                    Client client = login();
                    if(client!=null){
                        return client;
                    }
                    break;

                case "3":
                    searchId();
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
            while (true) {
                empty2();
                name = inputDot("이름");
                boolean flagName = cr.nameCheck(name);
                if (flagName == true) {
                    break;
                } else {
                    System.out.println("이름을 다시 입력해주세요 (2~5글자)");
                }
            }

            //한글입력확인

            boolean koreanCheck = cr.koreanCheck(name);
            if (koreanCheck == true) {
                System.out.println("이름확인");
                empty2();
                break;
            } else {
                System.out.println("정확한 한글이름을 입력해주세요");

            }
        }


        //성별확인
        Gender gender;
        while (true) {
            String genderNum =(inputDot("성별 (1.남자 2.여자) "));
            gender = cr.genderCheck(genderNum);
            if (gender.equals(Gender.MALE) || gender.equals(Gender.FEMALE)) {
                System.out.println("성별확인");
                break;
            } else {
                System.out.println("성별을 다시 입력해주세요");
                empty2();

            }
        }
        empty2();


        //핸드폰번호입력
        String realNum;
        while (true) {

            String userPhone;
            while (true) {
                userPhone = inputDot("휴대폰 앞 3자리를 선택하세요 \n " +
                        "1.010  2.011  3.019  4.017  5.016\n");

                boolean flagPh = cr.phoneNum(userPhone);
                boolean checkNum = cr.integerCheck(userPhone);
                if (flagPh == true) {
                    if (checkNum == true) {
                        break;
                    }
                }else {
                    System.out.println("보기 안에 있는 숫자를 입력해주세요\n");
                }
            }
                empty2();
            String userPhone1 = inputDot("휴대폰번호(앞 3자리, '-' 제외 숫자만 입력하세요 ");

            String sd = cr.phone_firstNum(userPhone);

            realNum = sd + userPhone1;

            boolean phoneCheck = cr.phoneCheck(realNum);
            boolean checkNum = cr.integerCheck(realNum);
            String phone_format = cr.phone_format(realNum);
            if (checkNum == true) {
                if (phoneCheck == true) {
                    realNum = phone_format;
                    System.out.println("휴대폰번호 확인");
                    empty2();
                    break;
                } else {
                    System.out.println("10~11 사이의 번호를 입력하세요");
                    empty2();

                }
            } else {
                System.out.println("정확한 숫자를 입력하세요 \n");
            }
        }


        //인증번호 확인
        while (true) {
            int radomNum = cr.randomNum();


            String phoneCheckNum = (inputDot("인증번호입력"));

            boolean flagInt = cr.integerCheck(phoneCheckNum);

            if (flagInt == true) {
                boolean flagPhonCheckNum = cr.phoneCheckNum(phoneCheckNum, radomNum);
                if (flagPhonCheckNum == true) {
                    System.out.println("인증번호 일치");
                    empty2();

                    break;
                }else {
                    System.out.println("인증번호가 일치하지 않습니다");
                    empty2();

                }
            }else {
                System.out.println("숫자를입력하세요");
                empty2();


            }
        }
        String email = null;



        //개인메일계정 입력
        email = null;
        while (true) {
            String email1 = inputDot("@앞 메일 주소를 입력해주세요 ex)myblog0419");
            String flagEmailWrite = cr.emailWrite(email1);
            boolean engCheck = cr.englishCheck(email1);
            boolean intCheck = cr.integerCheck(email1);

            if (engCheck == true || intCheck == true) {
                if (flagEmailWrite == email1) {



                    //도메인입력
                    empty2();
                    String s = inputDot("메일도메인 (1.네이버 2.다음 3.카카오 4.기타(직접입력))");

                    boolean intCheck2 = cr.integerCheck(s);
                    if (intCheck2 == true) {

                        //정수변환
                        int email2 = Integer.parseInt(s);
                        //4.도메인 직접 입력시
                        if (email2 == 4) System.out.print("도메인을 입력하세요 : ");{
                        }
                        //도메인 선택 입력
                        boolean flagDomain = cr.domainPush(email2);
                        String emailDomainResult = cr.emailDomain(email2);

                        if (flagDomain == true) {
                            email = email1 + "@" + emailDomainResult;
                            System.out.println(email);
                            System.out.println("메일 확인");
                            empty2();

                            break;
                        }

                    } else {
                        System.out.println("숫자만 입력하세요");
                        empty2();

                    }

                }else {
                    System.out.println("메일을 다시 입력하세요 6~12자리");
                    empty2();

                }
            }else {
                System.out.println("영문과 숫자만 입력 가능합니다.");
                empty2();

            }
        }


        //주소입력
        String location = null;
        while (true) {
            location = inputDot("주소를 입력하세요 ex) xx시 xx구 xx동 + 기타주소");

            boolean flagLocation = cr.addressCheck(location);
            if (flagLocation == true) {
                System.out.println("주소확인");
                break;
            } else {
                System.out.println("다시입력하세요");
                empty2();

            }
        }
        empty2();

        //아이디입력
        String id;
        while (true) {
            id = inputDot("아이디");
            boolean flagId = cr.idCheck(id);    // 중복일때 true
            boolean idLength = cr.idLength(id);
            boolean integerCheck = cr.integerCheck(id);
            boolean englishCheck = cr.englishCheck(id);

            if (integerCheck || englishCheck) {
                if (!flagId) {
                    if (idLength) {
                        System.out.println("사용할 수 있는 아이디입니다");
                        System.out.println("아이디 확인");
                        empty2();

                        break;
                    } else {
                        System.out.println("6~12자리 사이 글자를 입력해주세요");
                        empty2();

                    }
                } else {
                    System.out.println("이미 가입된 아이디입니다. 다른 아이디를 입력하세요.");
                    empty2();

                }
            }else {
                System.out.println("영문 또는 숫자만 입력해주세요");
                empty2();

            }
        }

        //비밀번호 입력
        String pw;
        while (true) {
            pw = inputDot("비밀번호");
            String pw2 = inputDot("비밀번호확인");
            boolean flagPw = cr.pwCheck(pw, pw2);
            boolean length= cr.idLength(pw);
            boolean integerCheck = cr.integerCheck(pw);
            boolean englishCheck = cr.englishCheck(pw);

            if (integerCheck || englishCheck) {
                if (length == true) {
                    if (flagPw == true) {
                        System.out.println("비밀번호 확인완료");
                        empty2();

                        break;
                    } else {
                        System.out.println("비밀번호가 일치하지 않습니다 재입력하세요");
                        empty2();

                    }
                } else {
                    System.out.println("6~12자리 사이 비밀번호 입력하세요");
                    empty2();

                }
            }else {
                System.out.println("영문 또는 숫자만 입력해주세요");
                empty2();

            }
        }
        //나이입력
        int age;
        while (true) {

            try {
                age = Integer.parseInt(inputDot("나이"));
                boolean flagAge = cr.ageCheck(age);

                if (flagAge == true) {
                    System.out.println("나이 확인");
                    empty2();
                    System.out.println("회원가입 완료");
                    empty2();

                    break;
                } else {
                    System.out.println("0~150살 사이 값을 입력하세요");
                    empty2();

                }

            }catch (NumberFormatException e){
                System.out.println("0~150 사이 숫자를 입력하세요");
                empty2();


            }catch (Exception e){

            }


        }

        Client client = new Client(name, gender, realNum, email, location, id, pw, age);
        cr.clientList.add(client);
        int listNum=cr.clientList.size()-1;

        System.out.println("====가입된 회원정보====");
        System.out.println("이름 : "+cr.clientList.get(listNum).getUserName());
        System.out.println("성별 : "+cr.clientList.get(listNum).getGender());
        System.out.println("전화번호 : "+cr.clientList.get(listNum).getUserPhone());
        System.out.println("이메일 : "+cr.clientList.get(listNum).getEmail());
        System.out.println("주소 : "+cr.clientList.get(listNum).getLocation());
        System.out.println("아이디 : "+cr.clientList.get(listNum).getId());
        System.out.println("비밀번호 : "+cr.clientList.get(listNum).getPassword());
        System.out.println("나이 : "+cr.clientList.get(listNum).getAge());


    }


    //로그인화면
    private Client login() {
        //아이디로그인
        while (true) {
            String writeId = inputDot("아이디를 입력하세요");

            boolean flagIdSignUp = cr.checkIdSignUp(writeId);
            if (flagIdSignUp == true) {
                System.out.println("Id 확인");
                empty2();

                break;
            }else {
                System.out.println("존재하지 않는 아이디입니다. 다시 입력해주세요");
                empty2();

            }
        }
        //비밀번호 로그인
        while (true) {
            String writePw = inputDot("비밀번호를 입력하세요");

            Client client = cr.checkPwSignUp(writePw);

            if (!(client==null)) {
                System.out.println("Pw 확인");
                System.out.println("로그인완료");
                return client;
            }else {
                System.out.println("존재하지 않는 비밀번호입니다. 다시 입력해주세요");
                empty2();

                return null;
            }
        }

    }


    //아이디 찾기
    private void searchId() {
        String name = inputDot("이름을 입력하세요");
        String phoneNum = inputDot("휴대폰 번호를 입력하세요");

        while (true) {
            int ranNum = cr.randomInNum();
            String inNum = inputDot("인증번호를 입력하세요");

            boolean flagInCheck = cr.phoneCheckNum(inNum, ranNum);
            if (flagInCheck == true) {
                System.out.println("인증번호일치");
            } else {
                System.out.println("입력하신 인증번호가 다릅니다");
            }
        }


    }
}
