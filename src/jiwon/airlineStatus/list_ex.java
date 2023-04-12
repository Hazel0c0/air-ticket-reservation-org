//
//
//package jiwon.airlineStatus;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static yougeun.Utility.*;
//
//public class list_ex {
//
//  public static void main(String[] args) {
//
//    List<String> popularity = new ArrayList<>(
//        Arrays.asList("오사카", "후쿠오카", "타이페이", "도쿄"
//            , "제주공항", "홍콩 국제", "방콕", "오키나와 나하", "괌 A.B. 원팟")
//    );
//
//    switch (input("test중(1인기,2테마,3모두)")) {
//      case "1":
//        makeLine();
//        for (int i = 0, j = 1; i < popularity.size(); i++) {
//          System.out.print(popularity.get(i) + " ");
//          if (i + 1 == 3 * j) {
//            System.out.println();
//            j++;
//          }
//        }
//        makeLine();
//
//        break;
//      case "2":
//        String theme = inputDot("# 테마를 선택해주세요");
//        themeTravel(theme);
//
//// 맵으로 선택
//      case "3":
//// 동일
//      default:
//
//    }
//
//
//  }
//
//  private static void themeTravel(String theme) {
//
////    Map<String, List<String>> themeTravel = new HashMap<>();
//    List<TravelInfo> themeTravel = new ArrayList<>();
//    themeTravel.add(new TravelInfo("## HOT SUMMER! -- "));
//    themeTravel.add(new TravelInfo("## 초~! 특가 여행지"));
//    themeTravel.add(new TravelInfo("## 이색 여행지"));
//// theme.put("휴양지", "22");
//// theme.put("효도 관광", "배열..");
//    TravelInfo travelInfo;
//    switch (theme){
//      case "1":
//        travelInfo = themeTravel.get(0);
//      case "2":
//        travelInfo = themeTravel.get(1);
//        travelInfo.setThemeContents(discount);
//      case "3":
//        travelInfo = themeTravel.get(2);
//    }
//
////    if (themeTravel.contains(theme)) {
////
////      showTheme(key);
////    }
//  }
//
//  static void showTheme(String key) {
//    System.out.println(key);
//    System.out.println("----------------------------------------------");
//    for (String s : discount) {
//      System.out.println(s);
//      System.out.println("----------------------------------------------");
//    }
//  }
//
//
//  static List<String> discount = new ArrayList<>(
//      Arrays.asList(
//          "서울 / 인천 <-> 로스앤젤레스\n왕복\nKRW 1,502,700~",
//          "서울 / 인천 <-> 프랑크푸르트\n왕복\nKRW 1,353,200~",
//          "서울 / 인천 <-> 호놀룰루\n왕복\nKRW 1,054,500~"
//
//      )
//  );
//
//
//}
//
