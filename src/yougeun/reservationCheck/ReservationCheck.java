package yougeun.reservationCheck;

import yougeun.Client.Client;
import yougeun.Client.ClientRepository;
import yougeun.Client.Ticket;
import yougeun.Utility;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ReservationCheck {


    // 승객의 정보를 반환하는 함수
    public static Client findName(String name){
        ArrayList<Client> clientArrayList = ClientRepository.getClientArrayList();
        for (Client client : clientArrayList) {
            if(client.getUserName().equals(name)){
                return client;
            }
        }
        return null;
    }

    /**
     *  이름을 입력하면 예약 정보가 나오는 함수
     */
    public static void check(){
        Utility.topBar();
        System.out.println("=== 삼조 에어라인 예약 정보 시스템 ===");
        String name = Utility.input("승객 정보 이름을 입력해주세요 ");
        Client client = findName(name);
        if(client==null){
            System.out.println(name + "으로 가입된 이름이 없습니다.");
            return;
        }
        Ticket ticket = client.getTicket();
        if(ticket.getPassenger()==0){
            System.out.println(name + "님이 조회한 티켓의 정보가 없습니다.");
            return;
        }

        System.out.println(name + "님이 예약한 정보입니다.");
        info(client);
    }

    // 티켓의 정보를 알려주는 함수
    public static void info(Client client){
        Ticket ticket = client.getTicket();
        System.out.println("출발날짜 : " + ticket.getGo() );
        System.out.println("출발지 : " + ticket.getFrom());
        System.out.println("도착지 : " + ticket.getDestination() );
        System.out.println("왕복|편도 : " + ticket.getWay() );
        System.out.println("총인원 : " + ticket.getPassenger() );
        System.out.println("좌석 : " + ticket.getGrade() );
        System.out.println("결제금액 : " + NumberFormat.getInstance(Locale.getDefault()).format(ticket.getPay()) + "원");
        System.out.println("결제여부 : " + client.isPay());
    }

}
