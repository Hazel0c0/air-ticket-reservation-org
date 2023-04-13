package jiwon.airlineStatus;

import jiwon.enumset.Continent;
import jiwon.enumset.Theme;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static jiwon.airlineStatus.StatusRepository.city;
import static jiwon.enumset.Continent.*;
import static jiwon.enumset.Theme.*;
import static yougeun.Utility.*;

public class AirlineRepository {
  static List<String> airportList;
  static String from;

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
    from = airportList.get(n);
    return from;
  }

  static void destination(String inputTo, String from) {


    Map<String, Object> theme = new HashMap<>();
    theme.put("1", "HOT SUMMER!");
    theme.put("", "초~!특가 여행지");
    theme.put("", "이색 여행지");
//    휴양지, 효도관광

  }

  static Stream<City> filter;
  static void themeTravel(Theme theme) {
    // 테마별
    filter = city.stream()
        .filter(t -> t.getTheme() == theme);
    filter();
  }
  static void continentTravel(Continent ct) {
    // 국가별
    filter = city.stream()
        .filter(c -> c.getContinent() == ct);
    filter();
  }
  static void filter() {
    filter
        .collect(toList())
        .forEach(popul -> {
          System.out.println("    " + from + " <-> " + popul.getCountryName());
          System.out.println("    왕복");
          System.out.println("    KRW " + popul.getFee() * 2);
          makeLine();
        });
  }

// 테마별 여행지
  static public Theme themeChangeNum(String inputTheme) {
    switch (inputTheme) {
      case "1":
        return SEASON;
      case "2":
        return DISCOUNT;
      case "3":
        return UNUSUAL;
    }
    return NORMAL;
  }

  //나라별 여행지 ( 모든도시 보여주기)
  public static Continent pickContinent(String s){
    Map<String, Continent> cMap = new HashMap<>();
    cMap.put("1", DOMESTIC);
    cMap.put("2", CHINA);
    cMap.put("3", JAPAN);
    cMap.put("4", SOUTHEAST_ASIA);
    cMap.put("5",AMERICA);
    cMap.put("6",EUROPE);
    cMap.put("7",OCEANIA);

    return cMap.get(s);


  }
}
