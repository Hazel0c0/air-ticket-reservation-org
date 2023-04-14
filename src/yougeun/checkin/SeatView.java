package yougeun.checkin;

import jiwon.enumset.Grade;
import yougeun.Client.Client;
import yougeun.Client.ClientRepository;
import yougeun.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class SeatView {
    /**
     * 유저 정보가 있는지 알아보는 함수
     *
     * @param name 이름
     * @return 유저가 존재하면 true, 존재하지 않으면 false
     */
    public static Client isUser(String name) {
        ArrayList<Client> clientArrayList = ClientRepository.getClientArrayList();
        for (Client client : clientArrayList) {
            if(client.getUserName().equals(name)){
                return client;
            }
        }
        return null;
    }
    public static void checkin(Client client) {
        boolean[][] seatTest;

        Utility.topBar();
        System.out.println("=== 삼조 에어라인 체크인 시스템 ===");
        if(client.getTicket().getPassenger()==0){
            System.out.println(client.getUserName() + " 님으로 조회된 데이터가 없습니다.");
            return;
        }
        if(client.getTicket().isCheckin()){
            System.out.println(client.getUserName() + "님은 이미 체크인이 완료되었습니다!");
            return;
        }

        if(client.getTicket().getGrade()== Grade.FIRST){
            seatTest = SeatVO.getSeat2();
        } else {
            seatTest = SeatVO.getSeat();
        }


        System.out.println(client.getUserName() + "님의 체크인 정보");

        for (int k = 0; k < client.getTicket().getPassenger(); k++) {
            if(k==0) {
                System.out.println(client.getUserName() + "님 좌석 선택");
            } else{
                System.out.println(client.getUserName() + "님 " + k + "일행님 좌석 선택");
            }

            // 렌터카 정보, 호텔 정보 => 제주도  || 해외 관광지, 블로그 =>
            // 마이페이지 ->
            // 1.   2.
            // 1.   2.
            System.out.println("■ 예약 불가, □ 예약 가능");
            int i = 1;

            if(seatTest[0].length==3){
                System.out.println("    A B     C");
            } else {
                System.out.println("    A B C D E F");
            }


            if (seatTest[0].length==6) {
                for (boolean[] booleans : seatTest) {
                    System.out.print(i + " : ");
                    i++;
                    for (boolean aBoolean : booleans) {
                        if (aBoolean) {
                            System.out.print("■ ");
                        } else {
                            System.out.print("□ ");
                        }
                    }
                    System.out.println();
                }
            } else {
                for (boolean[] booleans : seatTest) {
                    System.out.print(i + " : ");
                    i++;
                    int j=0;
                    for (boolean aBoolean : booleans) {
                        j++;
                        if (aBoolean) {
                            if(j%3==0){
                                System.out.print("     ■");
                            }
                            else{
                                System.out.print("■ ");
                            }
                        } else {
                            if(j%3==0){
                                System.out.print("     □");
                            }
                            else{
                                System.out.print("□ ");
                            }
                        }
                    }
                    System.out.println();
                }
            }
            while (true) {
                String seat = Utility.input("예약 좌석을 선택해주세요 ex)A1, B2, C3 [ 0 ] 되돌아가기");
                if(seat.equals("0")) return;
                if (!(seat.length() == 2)) {
                    System.out.println("2글자 입력해주세요.");
                    continue;
                }
                int seatCol = (int) seat.toUpperCase().charAt(0) - 65;
                int seatRow = seat.charAt(1) - 49;
    //            System.out.println(seatRow + " " + seatCol);
                if (!((seatRow >= 0 && seatRow < 9) && (seatCol >= 0 && seatCol < 6))) {
                    System.out.println("좌석이 올바르지 않아요 A1~F9");
                    continue;
                }
                if (seatTest[seatRow][seatCol]) {
                    System.out.println("이미 선택된 자리입니다. 다시 입력해주세요");
                    continue;
                }
                seatTest[seatRow][seatCol] = true;
                System.out.println(seat + "예약이 완료되었습니다.");
                break;
            }
        }
        System.out.println(client.getUserName() +"님의 총 " + client.getTicket().getPassenger() + "명의 체크인이 완료되었습니다.");
        client.getTicket().setCheckin(true);
    }
}
