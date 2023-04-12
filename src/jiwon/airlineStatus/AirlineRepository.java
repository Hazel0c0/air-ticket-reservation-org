package jiwon.airlineStatus;

import jiwon.StringList;
import yougeun.Utility;

import java.util.*;

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
    List<String> popularity = new ArrayList<>(
        Arrays.asList("오사카", "후쿠오카", "타이페이", "도쿄"
            , "제주공항", "홍콩 국제", "방콕", "오키나와 나하", "괌 A.B. 원팟")
    );

    switch (inputTo) {
      case "1":
        makeLine();
        for (int i = 0,j=1; i < popularity.size(); i++) {
          System.out.print(popularity.get(i)+"   ");
          if (i+1==3*j) {
            System.out.println();
            j++;
          }
        }
        makeLine();

        break;
      case "2":
//        맵으로 선택
      case "3":
//        동일
      default:
    }
    Map<String, Object> destination = new HashMap<>();

    destination.put("휴양지", "괌");
    destination.put("이색 여행지", "배열..");

  }
}
