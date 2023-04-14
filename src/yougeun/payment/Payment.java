package yougeun.payment;


import jiwon.airlineStatus.City;
import jiwon.airlineStatus.StatusRepository;
import jiwon.enumset.Way;
import yougeun.Client.Client;
import yougeun.Client.Ticket;
import yougeun.Utility;
import yougeun.reservationCheck.ReservationCheck;

import java.text.NumberFormat;
import java.util.Locale;


// 결제 로직
public class Payment {


    public static void pay(Client client){
        if(client.isPay()){
            System.out.println("이미 결제가 완료되었습니다");
            return;
        }

        Ticket ticket =  client.getTicket();
        System.out.println(client.getUserName() + "님의 결제페이지");
        Utility.makeLine();
        ReservationCheck.info(client);
        Utility.makeLine();

        if(client.getCard().getBalance() >= ticket.getPay()){

            System.out.println("잔액 :" + NumberFormat.getInstance(Locale.getDefault()).format(client.getCard().getBalance()) + "원");
            if(Utility.input("결제 하시겠습니까? 취소 : 0").equals("0")){
                System.out.println("결제 취소!");
                return;
            }
            client.getCard().setBalance(client.getCard().getBalance() - ticket.getPay());
            client.setPay(true);
            System.out.println("결제가 완료되었습니다.");
            System.out.println("결제 후 잔액 :" + NumberFormat.getInstance(Locale.getDefault()).format(client.getCard().getBalance()) + "원");
            Utility.stop();
            System.out.println(client.getUserName() + "님이 결제한 티켓 내역입니다.");
            Utility.makeLine();
            ReservationCheck.info(client);
            Utility.makeLine();
            Utility.stop();
        } else {
            System.out.println("잔액이 부족합니다. 결제 취소!");
            Utility.stop();
            return;
        }
    }

}
