//package airproject;
//
//import day05.member.MemberRepository;
//
//import java.util.Scanner;
//
//public class ClientView {
//
//    Scanner sc;
//    ClientRepository cr;
//
//    public ClientView() {
//        this.sc = new Scanner(System.in);
//        this.cr = new ClientRepository();
//    }
//
//    /**
//     * 초기 메인 화면을 출력
//     */
//    void mainView() {
//        System.out.println("\n### 삼조 에어라인에 오신걸 환영합니다~~ ###");
//        System.out.println("* 1. 회원 정보 등록하기");
//        System.out.println("* 2. 로그인");
//        System.out.println("* 0. 프로그램 종료하기");
//        System.out.println("=============================");
//    }
//
//    void viewProcess() {
//
//        while (true) {
//            mainView();
//            String menuNum = input(">> ");
//
//            switch (menuNum) {
//                case "1":
//                    signUp();
//                    break;
//                case "2":
//                    login();
//                    break;
//                case "0":
//                    String answer = input("# 정말로 종료합니까? [y/n] : ");
//                    if (answer.toLowerCase().charAt(0) == 'y') {
//                        System.out.println("# 프로그램을 종료합니다.");
//                        System.exit(0);
//                    } else {
//                        continue;
//                    }
//                    break;
//                default:
//                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
//            }
//        }
//    }
//}
