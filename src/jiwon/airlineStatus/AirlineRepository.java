package jiwon.airlineStatus;

import jiwon.StringList;
import jiwon.enumset.Theme;
import yougeun.Client.Ticket;
import yougeun.Utility;

import java.util.*;

import static java.util.stream.Collectors.toList;
import static jiwon.airlineStatus.StatusRepository.city;
import static jiwon.enumset.Theme.*;
import static yougeun.Utility.*;

public class AirlineRepository {
  static List<String> airportList;

  static {
    airportList = new ArrayList<>(
        Arrays.asList("서울 / 인천", "서울 / 김포", "제주", "광주", "여수", "청주", "대구", "부산 / 김해")
    );
  }

  // 출발지 공항 목록
  public static void airportList() {
    int i = 1;
    for (String airport : airportList) {
      System.out.println("  " + i + ". " + airport);

      i++;
    }
  }

  // 출발지 선택
  static String startingPoint(String inputFrom) {
    // 숫자 선택
    int n = Integer.parseInt(inputFrom);
    return airportList.get(n);
  }

  static void destination(String inputTo) {


    switch (inputTo) {
      case "1": // 인기있는 여행지
        makeLine();

        city.stream()
            .filter(popul->popul.getTheme()== POPULARITY)
            .collect(toList())
            .forEach(popul-> System.out.println(popul));

        makeLine();

        break;
      case "2":
        String theme = inputDot("# 테마를 선택해주세요");
        themeTravel(theme);

//        맵으로 선택
      case "3":
//        동일
      default:
    }
    Map<String, Object> theme = new HashMap<>();
    theme.put("HOT SUMMER! -- ", "11");
    theme.put("초~!특가 여행지", discount);
    theme.put("이색 여행지", "배열..");
//    theme.put("휴양지", "22");
//    theme.put("효도 관광", "배열..");

  }

  static List<String> discount = new ArrayList<>(
      Arrays.asList(
          "서울 / 인천 <-> 로스앤젤레스\n왕복\nKRW 1,502,700~",
          "서울 / 인천 <-> 프랑크푸르트\n왕복\nKRW 1,353,200~",
          "서울 / 인천 <-> 호놀룰루\n왕복\nKRW 1,054,500~"
      )
  );

  private static void themeTravel(String theme) {

    Map<String, Object> themeTravel = new HashMap<>();
    //여름 휴가지
    themeTravel.put("1", "## HOT SUMMER! -- ");
    // 특가 여행지
//    themeTravel.put("2", discount);
    // 이색 여행지
    themeTravel.put("3", "## 이색 여행지");
    //    theme.put("휴양지", "22");
    //    theme.put("효도 관광", "배열..");

    if (themeTravel.containsKey(theme)) {
      System.out.println(themeTravel.get(theme));
    }
  }
//  static List<String> discount = new ArrayList<>(
//      Arrays.asList(
//          "## 초~!특가 여행지",
//          "----------------------------------------------\n",
//          "서울 / 인천 <-> 로스앤젤레스\n왕복\nKRW 1,502,700~",
//          "\n----------------------------------------------\n",
//          "서울 / 인천 <-> 프랑크푸르트\n왕복\nKRW 1,353,200~",
//          "\n----------------------------------------------\n",
//          "서울 / 인천 <-> 호놀룰루\n왕복\nKRW 1,054,500~",
//          "\n----------------------------------------------"
//      )
//  );


}
