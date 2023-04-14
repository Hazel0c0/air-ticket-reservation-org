package yougeun.airlineInfo;

import yougeun.Utility;

import java.util.List;
import static yougeun.Utility.*;

public class AirlineInfoView {



    public static void viewAirline(AirlineVO vo){


        while (true) {
            Utility.topBar();
            System.out.println("1. 공항정보");
            System.out.println("2. 체크인 정보");
            System.out.println("3. 라운지 정보");
            System.out.println("0. 뒤로가기");
            try {
                int userNum = Integer.parseInt(input("[ 원하는 정보를 선택하세요. ]"));

                switch (userNum){
                    case 1:
                        System.out.printf("공항 이름 : %s \n", vo.getName());
                        System.out.printf("공항 위치: %s \n", vo.getPosition());
                        System.out.printf("공항 웹사이트 : %s \n", vo.getWebsite());
                        stop();
                        break;
                    case 2:
                        Checkin ck = vo.getCheckin();
                        System.out.printf("체크인 카운터 : %s \n", ck.getCounter());
                        System.out.printf("오픈 시간 : %s \n", ck.getOpen());
                        System.out.printf("클로즈 시간 : %s \n", ck.getClose());
                        System.out.printf("키오스크 여부 : %s \n", ck.isKiosk());
                        System.out.printf("모바일 탑승권 여부 : %s \n", ck.isMobile());
                        System.out.printf("체크인 연락처 : %s \n", ck.getContact());
                        stop();
                        break;
                    case 3:
                        Lounge lg = vo.getLounge();
                        System.out.printf("라운지 이름 : %s \n", lg.getName());
                        System.out.printf("라운지 위치 : %s \n", lg.getPosition());
                        System.out.printf("라운지 운영 시간 : %s \n", lg.getOperatingTime());
                        stop();
                        break;
                    case 0:
                        return;
                    default:
                        inputError();
                        System.out.println("[ 지원되는 번호 1, 2, 3, 0 ]");
                        stop();
                }

            } catch (NumberFormatException e) {
                inputError();
            }
        }

//        공항선택, 공항정보, 체크인, 라운지


    }




    public static void selectAirline() {
        while (true) {
            List<AirlineVO> airlineVOList = AirlineRepository.getAirlineVOList();
            for (int i = 0; i < airlineVOList.size(); i++) {
                System.out.printf("%d. %s\n", (i + 1), airlineVOList.get(i).getName());
            }
            System.out.println("0. 뒤로가기");
            try {
                int select = Integer.parseInt(input("[ 보고 싶은 공항의 정보를 선택하세요. ] "));
                if(select==0) return;
                if(select>airlineVOList.size()) {
                    System.out.println("해당 번호는 없는 공항입니다.");
                    stop();
                    continue;
                }
                viewAirline(airlineVOList.get(select-1));
            } catch (NumberFormatException e) {
                System.out.println("지원되지 않는 명령어입니다.");
            }

        }
    }


}
