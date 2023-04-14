package yougeun.myflight;

import yougeun.Client.Card;
import yougeun.Client.Client;
import yougeun.Client.ClientRepository;
import yougeun.Utility;

import java.text.NumberFormat;
import java.util.Locale;

import static yougeun.Utility.input;

public class MyPage {


    public static void menu(){
        Utility.topBar();
        System.out.println("=== 삼조 에어라인 마이 페이지 ===");
        System.out.println("1. 현재 잔액 조회하기");
        System.out.println("2. 현재 마일리지 조회하기");
        System.out.println("3. 입금하기");
        System.out.println("4. 출금하기");
        System.out.println("5. 개인정보 변경하기 (이름, 번호, 이메일)");
        System.out.println("6. 유저 정보 조회하기 (이름, 번호, 이메일)");
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
                long money = Integer.parseInt(input("얼마를 출금하시겠습니까?"));
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
                long money = Integer.parseInt(input("얼마를 입금하시겠습니까?"));
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
                int menuNum = Integer.parseInt(input("번호를 입력해주세요"));

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
//                        System.out.println("입금");
                        deposit(client);
                        Utility.stop();
                        break;
                    case 4:
//                        System.out.println("출금");
                        withdraw(client);
                        Utility.stop();
                        break;
                    case 5:
//                        System.out.println("개인정보 변경하기");
                        myPageChange(client);
                        Utility.stop();
                        break;
                    case 6:
//                        System.out.println("유저 정보 조회");
                        ClientRepository.showClient(client);
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



    // 개인정보 변경하기 (이름, 번호, 이메일)
    private static void myPageChange(Client client) {
        System.out.println("현재 이름 : " + client.getUserName());
        String name = input("변경하고자 하는 이름을 입력하세요. (스킵 #)");
        if (!Utility.skip(name.charAt(0))) {
            client.setUserName(name);
            System.out.println(name + "으로 변경되었습니다.");
        } else {
            System.out.println("이름을 변경하지 않습니다.");
        }

        System.out.println("현재 번호 : " + client.getUserPhone());
        String phone = input("변경하고자 하는 번호를 입력하세요. (스킵 #)");
        if (!Utility.skip(phone.charAt(0))) {
            client.setUserPhone(phone);
            System.out.println(phone + "으로 변경되었습니다.");
        } else {
            System.out.println("핸드폰 번호를 변경하지 않습니다.");
        }

        System.out.println("현재 이메일 : " + client.getEmail());
        String email = input("변경하고자 하는 이메일을 입력하세요. (스킵 #)");
        if (!Utility.skip(email.charAt(0))) {
            client.setEmail(email);
            System.out.println(email + "으로 변경되었습니다.");
        } else {
            System.out.println("이메일을 변경하지 않습니다.");
        }
        ClientRepository.showClient(client);
    }

}
