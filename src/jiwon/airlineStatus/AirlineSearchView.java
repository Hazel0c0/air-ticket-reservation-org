package jiwon.airlineStatus;

import static yougeun.Utility.*;

// 항공편 현황
public class AirlineSearchView {
  void searchView() {
    System.out.println("===== 항공권 예매 =====");
    input("출발지 입력해주세요");
    /* 출발지 (일부) 입력하면 출발지 목록 보여주는 기능 */

    input("도착지 입력해주세요");
    /* 출발지 입력 되면 가지 못하는 도착지 지워지게 */

    input("가는날");
    input("오는날");
    /* 오는날 선택시 가는날 전날은 선택하지 못하도록 */

    input("1. 왕복   2. 편도");
//  ROUND_TRIP, ONE_WAY

    String inputGrade = input("좌석 등급을 선택해주세요\n" +
        "1. ECONOMY  2. PRESTIGE  3. FIRST");
    GRADE grade = seatGrade(inputGrade);
  }

  GRADE seatGrade(String n) {
    switch (n) {
//      case "1":
//        return GRADE.ECONOMY;
//      case "2":
//        return GRADE.PRESTIGE;
//      case "3":
//        return GRADE.FIRST;
      default:
        System.out.println("숫자를 정확히 입력해주세요");
    }
    return null;
  }


}
