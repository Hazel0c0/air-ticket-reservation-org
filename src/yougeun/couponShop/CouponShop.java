package yougeun.couponShop;

import yougeun.Client.Client;
import yougeun.Utility;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class CouponShop {



    // 마일리지 쇼핑몰에 대한 정보를 출력
    public static void menu(){
        Utility.topBar();
        System.out.println("=== 에어라인 마일리지 쿠폰 쇼핑몰입니다. ===");
        System.out.println("1. 나의 쿠폰 정보 보기");
        System.out.println("2. 쿠폰 구매하기");
        System.out.println("0. 돌아가기");
    }

    // 마일리지 쇼핑몰 로직
    public static void shop(Client client){
        while(true) {
            menu();
            String s = Utility.input("원하시는 메뉴를 선택하세요");
            switch (s){
                case "1":
                    myCouponView(client);
                    break;
                case "2":
                    buyCoupon(client);
                    break;
                case "0":
                    return;
                default:
                    Utility.inputError();
            }
        }
    }


    // 쿠폰 구매 로직
    private static void buyCoupon(Client client){
        while (true){
            System.out.println(client.getUserName() + "님의 마일리지 : " + NumberFormat.getInstance(Locale.getDefault()).format(client.getPoint())+"마일리지");
            System.out.println("1. 에버랜드 이용권 : 5,400마일리지");
            System.out.println("2. 영화관람권 : 4,100마일리지");
            System.out.println("3. 여행패키지상품 : 40,000마일리지");
            System.out.println("4. 호텔&리조트 이용권 : 500,000마일리지");
            System.out.println("0. 돌아가기");

            String s = Utility.input("어떤 상품을 구매하시겠습니까?");
            switch (s.charAt(0)){
                case '1':
                    buy(client, 5400, "에버랜드 이용권");
                    break;
                case '2':
                    buy(client, 4100, "영화관람권");
                    break;
                case '3':
                    buy(client, 40000, "여행패키지상품");
                    break;
                case '4':
                    buy(client, 500000, "호텔&리조트 이용권");
                    break;
                case '0':
                    return;
                default:
                    Utility.inputError();
                    break;
            }




        }


    }

    /** 상품 구매를 하면 클라이언트 쿠폰 리스트에 추가해주는 함수
     *
     * @param client 클라이언트 정보
     * @param price 가격정보
     * @param couponName 쿠폰 이름
     */
    private static void buy(Client client, int price, String couponName) {
        if(!(client.getPoint() >= price)){
            System.out.println("마일리지 잔액이 부족합니다.");
            return;
        }
        client.setPoint(client.getPoint()-price);
        client.getCouponList().add(couponName);
        System.out.println(couponName + " 구매가 완료되었습니다.");
        System.out.println("남은 마일리지 잔액 : " + NumberFormat.getInstance(Locale.getDefault()).format(client.getPoint())+"마일리지" );
        Utility.stop();
    }
    private static void myCouponView(Client client) {
        ArrayList<String> list = client.getCouponList();
        if(list.size()==0) {
            System.out.println("쿠폰 내역이 없습니다.");
            Utility.stop();
            return;
        }
        System.out.println(client.getUserName() + "님의 쿠폰 내역");
        int i = 1;
        for (String s : client.getCouponList()) {
            System.out.println(++i + ". " + s);

        }
        Utility.makeLine();
        Utility.stop();
    }
}
