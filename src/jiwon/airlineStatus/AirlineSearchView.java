package jiwon.airlineStatus;

import jiwon.enumset.Continent;
import jiwon.enumset.Grade;
import jiwon.enumset.Theme;

import static jiwon.airlineStatus.AirlineRepository.*;
import static jiwon.airlineStatus.AirlineRepository.pickContinent;
import static jiwon.enumset.Continent.CHINA;
import static jiwon.enumset.Theme.POPULARITY;
import static jiwon.enumset.Theme.SEASON;
import static yougeun.Utility.*;

// 항공편 현황
public class AirlineSearchView {
  static AirlineRepository ar;

  static {
    ar = new AirlineRepository();
  }

  public static void searchView() {
    System.out.println("===== 항공권 예매 =====");

    /* [+] 출발지 (일부) 입력하면 출발지 목록 보여주는 기능 */
    airportList(); // 출발지 목록
    String airport = startingPoint(input("\n# 출발지를 선택해주세요"));
    System.out.println("[ 선택하신 공항은 " + airport + "입니다 ]\n");

    /* 출발지 입력되면 가지 못하는 도착지 지워지게 */
    System.out.println("# 여행 할 도시 선택을 도와드릴게요");
    System.out.println("  1. 지금! 인기 여행지");
    System.out.println("  2. 테마별 여행지");
    System.out.println("  3. 전체 도시 보기");

    String inputTo = input("\n 번호를 선택해주세요");
    System.out.println();

    String msg = "여행을 떠나고 싶은 나라를 선택해주세요";
    switch (inputTo) {
      case "1": // 인기있는 여행지
        System.out.println("\n*** 이번달 인기 여행지 입니다 ***");
        makeLine();
        ar.choiceCity();
        ar.choice(POPULARITY);
        pickCity(input(msg));
        break;
      case "2":
        Theme pickTheme=themeChangeNum(inputDot("# 테마를 선택해주세요"));
        System.out.println("1. HOT SUMMER!");
        System.out.println("2. 초~!특가 여행지");
        System.out.println("3. 이색 여행지");
        choice(pickTheme);
        input(msg);

        break;
      case "3":
        System.out.println("1. 국내");
        System.out.println("2. 중화권");
        System.out.println("3. 일본");
        System.out.println("4. 동남아");
        System.out.println("5. 미주");
        System.out.println("6. 유럽");
        System.out.println("7. 대양주");
        Continent pickContinent =pickContinent(inputDot("# 번호를 선택해주세요 "));
        // 번호로만 선택받을지, 글자로도 받을지
        choice(pickContinent);
        input(msg);
        break;
      default:
    }

    int go = 230411;
//    날짜 어떤식으로 입력하는게 좋을지..
    while (true) {
      go = Integer.parseInt(input("\n# 가는날 \n여섯자리를 정확히 입력해주세요(ex.230411)"));
      if (go >= 230411) {
        break;
      }
      // 오늘날짜 이후로 선택 가능하게 if
      // ex 에 오늘날짜 나오게 설정
    }
    while (true) {
      int comeBack
          = Integer.parseInt(input("\n# 오는날 \n여섯자리를 정확히 입력해주세요(ex.230412)"));
      if (comeBack > go) {
        break;
      } else {
        System.out.println("!! 오늘날을 다시 입력해주세요.");
      }
    }

    makeLine();
    System.out.println(
        "\n전 구간에 소아와 함께 여행하는 동반 성인이 있을 경우,\n" +
            "소아 단독 항공권 구매가 가능합니다.\n" +
            "유아는 탑승일 기준 만 2세 미만까지이며,\n" +
            "좌석을 점유하지 않습니다.\n");
    makeLine();
    System.out.println("# 탑승 인원을 입력해주세요");
    String adult = inputDot("성인");
    String child = inputDot("소아");
    String baby = inputDot("유아");

    String way = input("\n  [ 1. 왕복   2. 편도 ]");
    //  ROUND_TRIP, ONE_WAY

    String inputGrade = input("\n# 좌석 등급을 선택해주세요\n" +
        "1. ECONOMY  2. PRESTIGE  3. FIRST");
    Grade grade = seatGrade(inputGrade);

  }

  private static Grade seatGrade(String n) {
    switch (n) {
      case "1":
        return Grade.ECONOMY;
      case "2":
        return Grade.PRESTIGE;
      case "3":
        return Grade.FIRST;
      default:
        System.out.println("숫자를 정확히 입력해주세요");
        return null;
    }
  }


}
