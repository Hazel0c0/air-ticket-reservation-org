package yougeun;

import jiwon.airlineStatus.AirlineSearchView;
import yougeun.Client.Client;
import yougeun.Client.ClientRepository;
import yougeun.airlineInfo.AirlineInfoView;
import yougeun.board.BoardView;
import yougeun.checkin.SeatView;
import yougeun.couponShop.CouponShop;
import yougeun.myflight.MyPage;
import yougeun.payment.Payment;
import yougeun.reservationCheck.ReservationCheck;
import yougeun.schedule.ScheduleFareCheck;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static yougeun.Utility.*;


public class SamjoAirLine {
    // 메인 메뉴 화면입니다!
    static public boolean isKo;

    public static void menu(Client client){
        Utility.topBar();
        System.out.println("✦── 삼조 에어라인에 오신 "+ client.getUserName()+"님 환영합니다 ──");
        System.out.println("┆   1. 예매하기");
        System.out.println("✿   2. 마이페이지");
        System.out.println("┆   3. 회원서비스");
        System.out.println("✿   0. 로그아웃");
        System.out.println("╰───────────────\uD83E\uDD40");
    }

    public static void menu1(Client client){
        while (true) {
            Utility.topBar();
            System.out.println("✦── 삼조 에어라인에 오신 "+ client.getUserName()+"님 환영합니다 ──");
            System.out.println("┆  1. 국내선예매");
            System.out.println("✿  2. 국제선예매");
            System.out.println("✿  0. 뒤로가기");
            System.out.println("╰───────────────\uD83E\uDD40");

            try {
                int selectMenu = Integer.parseInt(input("원하는 메뉴를 선택하세요 : "));
                switch (selectMenu){
                    case 1:
                        isKo=true;
                        AirlineSearchView.searchView(client, true);
    //                System.out.println("국내선 예매");
                        stop();
                        break;
                    case 2:
                        AirlineSearchView.searchView(client, false);
                        break;
                    case 0:
                        return;
                    default:
                        inputError();
                        stop();
                }
            } catch (NumberFormatException e) {
                System.out.println("에러 다시 입력하세요");
            }
        }


    }
    public static void menu2(Client client){
        while (true) {
            Utility.topBar();
            System.out.println("✦── 삼조 에어라인에 오신 "+ client.getUserName()+"님 환영합니다 ──");
            System.out.println("┆  1. 체크인");
            System.out.println("✿  2. 예약조회");
            System.out.println("✿  3. 마일리지 쇼핑몰");
            System.out.println("✿  4. My Flight");
            System.out.println("┆  5. 스케줄/운임조회");
            System.out.println("✿  0. 뒤로가기");
            System.out.println("╰───────────────\uD83E\uDD40");
            try {
                int selectMenu = Integer.parseInt(input("원하는 메뉴를 선택하세요 : "));
                switch (selectMenu){
                    case 1:
                        SeatView.checkin(client);
                        break;
                    case 2:
                        ReservationCheck.check();
                        break;
                    case 3:
                        CouponShop.shop(client);
                        break;
                    case 4:
                        MyPage.myPageMenu(client);
                        break;
                    case 5:
                        ScheduleFareCheck.menu();
                        break;
                    case 0:
                        return;
                    default:
                        inputError();
                        stop();
                }
            } catch (NumberFormatException e) {
                System.out.println("에러 다시 입력하세요");
            }
        }
    }


    public static void menu3(Client client){
        while (true) {
            Utility.topBar();
            System.out.println("✦── 삼조 에어라인에 오신 "+ client.getUserName()+"님 환영합니다 ──");
            System.out.println("┆  1. 공항안내");
            System.out.println("✿  2. 공지사항");
            System.out.println("✿  3. 고객센터");
            System.out.println("✿  0. 뒤로가기");      // 동우님
            System.out.println("╰───────────────\uD83E\uDD40");
            try {
                int selectMenu = Integer.parseInt(input("원하는 메뉴를 선택하세요 : "));
                switch (selectMenu){
                    case 1:
                        AirlineInfoView.selectAirline();
                        break;
                    case 2:
                        BoardView.run();
                        break;
                    case 3:
                        customerCenter();
                        break;
                    case 0:
                        return;
                    default:
                        inputError();
                        stop();
                }
            } catch (NumberFormatException e) {
                System.out.println("에러 다시 입력하세요");
            }
        }
    }

    private static void customerCenter() {
        System.out.println("진짜 여행, 쉼입니다.");
        System.out.println();
        System.out.println("M ) 카카오 채팅상담 운영시간");
        System.out.println("9:00 ~ 9:10");
        System.out.println();

        System.out.println("- 이후 상담은 이메일 접수 시 신속히 도와드립니다.");
        System.out.println("이메일 : hsg9984@gmail.com");
        System.out.println();
        System.out.println("(항공) 변경/환불 접수가능시간");
        System.out.println("월-금 09:00~17:00");
        Utility.stop();
    }


    /**
     * 번호에 따라 원하는 메뉴를 실행하는 함수입니다.
     * @param selectMenu 유저로 부터 입력을 받은 변수
     */
    public static boolean losic(int selectMenu, Client client){

        switch (selectMenu){
            case 1:
                AirlineSearchView.searchView(client, true);
//                System.out.println("국내선 예매");
                stop();
                break;
            case 2:
                AirlineSearchView.searchView(client, false);
//                Payment.pay(client);
//                System.out.println("결제");
                stop();
                break;
            case 3:
//                System.out.println("공항 안내");
                AirlineInfoView.selectAirline();
//                stop();
                break;
            case 4:
                BoardView.run();
                break;
            case 5:
                SeatView.checkin(client);
                stop();
                break;
            case 6:
//                System.out.println("예약 조회");
                ReservationCheck.check();
                stop();
                break;
            case 7:
//                System.out.println("마일리지 쇼핑몰");
                CouponShop.shop(client);
                stop();
                break;
            case 8:
//                System.out.println("My Flight");
                MyPage.myPageMenu(client);
                stop();
                break;
            case 9:
                System.out.println("스케줄 운임 조회");
                ScheduleFareCheck.menu();
                stop();
                break;
            case 0:
                System.out.println("로그아웃");
                return false;
            default:
                inputError();
                System.out.println("지원되는 번호 : [1번~0번]");
                stop();
        }
        return true;
    }


    public static boolean mainLogic(int selectMenu, Client client) {
        switch (selectMenu){
            case 1:
                menu1(client);
                break;
            case 2:
               menu2(client);
                break;
            case 3:
                menu3(client);
                break;
            case 0:
                System.out.println("로그아웃");
                return false;
            default:
                inputError();
                stop();
        }
        return true;


    }


    // 메인 실행 함수
    public static void run(Client client){
        while (true) {
            menu(client);
            try {
                int selectMenu = Integer.parseInt(input("원하는 메뉴를 선택하세요 : "));
                if(!mainLogic(selectMenu, client)){
                    return;
                }
            } catch (Exception e) {
                inputError();
            }

        }
    }


}
