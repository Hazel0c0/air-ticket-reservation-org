package yougeun.checkin;

import yougeun.Client.Client;
import yougeun.Client.ClientRepository;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String name = sc.nextLine();
        Client client = isUser(name); // 유저 정보가 존재하는지 확인하기
        if(client==null){
            System.out.println("유저 정보가 존재하지 않아요");
            return;
        }


        System.out.println(name + "님의 체크인 정보");
        System.out.println("예약 1 " + name + "손님");
        System.out.println("예약 2 " + name + "손님");


        boolean seatTest[][] = SeatVO.getSeat();
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
            System.out.println("예약 좌석을 선택해주세요 ex)A1, B2, C3");
            String a = sc.nextLine();
            if (!(a.length() == 2)) {
                System.out.println("2글자 입력해주세요.");
                continue;
            }

            int seatCol = (int) a.toUpperCase().charAt(0) - 65;
            int seatRow = a.charAt(1) - 49;
            System.out.println(seatRow + " " + seatCol);
            if (!((seatRow >= 0 && seatRow < 9) && (seatCol >= 0 && seatCol < 6))) {
                System.out.println("좌석이 올바르지 않아요 A1~F9");
                continue;
            }
            if (seatTest[seatRow][seatCol]) {
                System.out.println("이미 선택된 자리입니다. 다시 입력해주세요");
                continue;
            }
            break;
        }


    }
}
