package yougeun.checkin;

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
    public static void checkin() {
        boolean[][] seatTest = SeatVO.getSeat();
        System.out.println("=== 삼조 에어라인 체크인 시스템 ===");
        Scanner sc = new Scanner(System.in);
        String name = Utility.input("체크인 하고자 하는 이름을 입력하세요.");
        Client client = isUser(name); // 유저 정보가 존재하는지 확인하기
        if(client==null){
            System.out.println("유저 정보가 존재하지 않아요");
            return;
        }


        System.out.println(name + "님의 체크인 정보");

        for (int k = 0; k <= client.getTicket().getPassenger(); k++) {
            if(k==0) {
                System.out.println(name + "님 좌석 선택");
            } else{
                System.out.println(name + "님 " + k + "일행님 좌석 선택");
            }



            System.out.println("■ 예약 불가, □ 예약 가능");
            int i = 1;
            System.out.println("    A B C D E F");
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
    }
}
