package yougeun.payment;


import jiwon.airlineStatus.City;
import jiwon.airlineStatus.StatusRepository;
import jiwon.enumset.Way;
import yougeun.Client.Client;
import yougeun.Client.Ticket;



// 결제 로직
public class Payment {


    public static void pay(Client client){

        System.out.println("결제 금액 = " + client.getTicket().getPay() +"원");
    }

}
