package yougeun.myflight;

import yougeun.Client.Card;
import yougeun.Client.Client;
import yougeun.Utility;

import java.text.NumberFormat;
import java.util.Locale;

public class MyPage {


    public static void menu(){
        System.out.println("=== 삼조 에어라인 마이 페이지 ===");
        System.out.println("1. 현재 잔액 조회하기");
        System.out.println("2. 현재 마일리지 조회하기");
        System.out.println("3. 입금하기");
        System.out.println("4. 출금하기");
        System.out.println("5. 개인정보 변경하기 (이름, 번호, 이메일)");
        System.out.println("0. 돌아가기");
    }

    public static void getBalance(Card card){
        System.out.println("현재 남은 잔액 : " + NumberFormat.getInstance(Locale.getDefault()).format(card.getBalance())+"원");
    }

    //출금하기
    public static void withdraw(Client client){
        Card card = client.getCard();
        while (true) {
            try {
                getBalance(card);
                long money = Integer.parseInt(Utility.input("얼마를 출금하시겠습니까?"));
                if(money<=0){
                    System.out.println(money + " 잘못 입력하셨습니다! (음수, 0...)");
                    continue;
                }
                if(money>card.getBalance()){
                    System.out.println("계좌 잔액보다 출금금액이 많습니다.");
                    return;
                }
                card.setBalance(card.getBalance()-money);
                System.out.println("성공적으로 "+  NumberFormat.getInstance(Locale.getDefault()).format(money) +"원 출금이 완료되었습니다!");
                getBalance(card);
                return;

            } catch (Exception e) {
                Utility.inputError();
//                e.printStackTrace();
            }

        }
        
    }

    // 입금하기
    public static void deposit(Client client){
        Card card = client.getCard();
        while (true) {
            try {
                getBalance(card);
                long money = Integer.parseInt(Utility.input("얼마를 입금하시겠습니까?"));
                if(money<=0){
                    System.out.println(money + " 잘못 입력하셨습니다! (음수, 0...)");
                    continue;
                }
                if(money>50000000){
                    System.out.println("입금 한도는 5000만원까지입니다.");
                    continue;
                }
                card.setBalance(card.getBalance()+money);
                System.out.println("성공적으로 "+  NumberFormat.getInstance(Locale.getDefault()).format(money) +"원 입금 완료되었습니다!");
                getBalance(card);
                return;

            } catch (Exception e) {
                Utility.inputError();
//                e.printStackTrace();
            }

        }
    }

    public static void myPageMenu(Client client){

        while (true){
            menu();
            try {
                int menuNum = Integer.parseInt(Utility.input("번호를 입력해주세요"));

                switch (menuNum){
                    case 1:
                        System.out.println(client.getUserName() + "님의 현재 잔액 조회 : \n" +  NumberFormat.getInstance(Locale.getDefault()).format(client.getCard().getBalance()) + "원");
                        Utility.stop();
                        break;
                    case 2:
                        System.out.println(client.getUserName() + "님의 현재 마일리지 조회 : \n" + NumberFormat.getInstance(Locale.getDefault()).format(client.getCard().getBalance()) + "마일리지");
                        Utility.stop();
                        break;
                    case 3:
                        System.out.println("입금");
                        deposit(client);
                        Utility.stop();
                        break;
                    case 4:
                        System.out.println("출금");
                        withdraw(client);
                        Utility.stop();
                        break;
                    case 5:
                        System.out.println("개인정보 변경하기");
                        Utility.stop();
                        break;
                    case 0:
                        return;
                }
            } catch (NumberFormatException e) {
                Utility.inputError();
            }
        }
    }

}
