package jiwon.airlineStatus;

import jiwon.enumset.Continent;
import jiwon.enumset.Grade;
import jiwon.enumset.Theme;
import jiwon.enumset.Way;

import yougeun.Client.Client;
import yougeun.Client.Ticket;
import yougeun.Utility;
import yougeun.payment.Payment;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static jiwon.airlineStatus.AirlineRepository.*;
import static jiwon.enumset.Theme.*;
import static yougeun.Utility.*;

// 항공편 현황
public class AirlineSearchView {
  static AirlineRepository ar;
  static AirlineSearch as;
  static Ticket tk;
  static City c;


  static int n;    // 탑승인원

  static String test;

  static {
    ar = new AirlineRepository();
    as = new AirlineSearch();
    tk = new Ticket();
    c = new City();
  }

  // isOverseas == true면 해외, isOverseas false면 국내
  public static void searchView(Client client, boolean isOverseas) {
    Ticket ticket = client.getTicket();
    test = inputDot("\n성격이 급하신가요? ");

    System.out.println("\n===== 항공권 예매 =====");


    if (!test.equals("ㅇㅇ")) {

      date();   // 출도착일 검색
      n = personnel();

      // 왕복 편도 선택
      while (tk.getWay() == null) {
        ar.way(input("\n  [ 1. 왕복   2. 편도 ]"));
      }

      // 좌석 등급 선택
      while (tk.getGrade() == null) {
        ar.seatGrade(input("\n# 좌석 등급을 선택해주세요\n" +
            "1. ECONOMY  2. PRESTIGE  3. FIRST"));
      }
    }
    pickAirline(client, isOverseas);    // 출도착지 검색

  }

  private static void pickAirline(Client client, boolean isOverseas) {
    /* [+] 출발지 (일부) 입력하면 출발지 목록 보여주는 기능 */
    airportList(); // 출발지 목록
    String airport = startingPoint(input("\n# 출발지를 선택해주세요"));
    System.out.println("[ 선택하신 공항은 " + airport + "입니다 ]\n");
    tk.setFrom(airport);

    /* 출발지 입력되면 가지 못하는 도착지 지워지게 */
    System.out.println("# 여행 할 도시 선택을 도와드릴게요");
    System.out.println("  1. 어디로든지 문!!=3");
    System.out.println("  2. 테마별 여행지");
    System.out.println("  3. 전체 여행지");

    String inputTo = input("\n 번호를 선택해주세요");
    System.out.println();

    switch (inputTo) {
      case "1": // 인기있는 여행지
        System.out.println("\n*** 이번달 인기 여행지 입니다 ***");
        ar.choiceCity(POPULARITY);
        break;
      case "2":
        System.out.println("1. HOT SUMMER!");
        System.out.println("2. 바로 내일~! 여행");
        System.out.println("3. Class가 다른 이색 여행지");
        Theme pickTheme = ar.themeChangeNum(inputDot("# 테마를 선택해주세요"));
        ar.choiceCity(pickTheme);
        break;

      case "3":
        if (isOverseas) {
          System.out.println("1. 국내");
          ar.choiceCity(Continent.DOMESTIC);
          break;
        } else {
          System.out.println("1. 중화권");
          System.out.println("2. 일본");
          System.out.println("3. 동남아");
          System.out.println("4. 미주");
          System.out.println("5. 유럽");
          System.out.println("6. 대양주");
          Continent pickContinent = ar.pickContinent(inputDot("# 번호를 선택해주세요 "));
          // 번호로만 선택받을지, 글자로도 받을지
          ar.choiceCity(pickContinent);
          break;
        }
      default:
        System.out.println("번호를 정확히 입력해주세요");
    }
    if (stopInput("선택하신 항공권 확인해드리겠습니다. \n결제창으로 이동합니다 [ 취소 : 0번 ]")) {
      client.getTicket().setAll(tk.getFrom(), tk.getDestination(), tk.getGo(), tk.getComeback(), tk.getWay(), tk.getGrade(), tk.getPassenger(), tk.getPay());
      Payment.pay(client);
      //성공
    } else {
      System.out.println("취소합니다.");
      client.setTicket(new Ticket());
      return;
      //취소
    }


  }

  private static Way way(String pickWay) {
    switch (pickWay) {
      case "1":
      case "왕복":
        return Way.ROUND_TRIP;
      case "2":
      case "편도":
        return Way.ONE_WAY;
    }
    return null;
  }

  private static int personnel() {
    makeLine();
    System.out.println(
        "전 구간에 소아와 함께 여행하는 동반 성인이 있을 경우,\n" +
            "소아 단독 항공권 구매가 가능합니다.\n" +
            "유아는 탑승일 기준 만 2세 미만까지이며,\n" +
            "좌석을 점유하지 않습니다.");
    makeLine();
    while (true) {
      try {
        System.out.println("# 탑승 인원을 입력해주세요");
        int adult = Integer.parseInt(inputDot("성인"));
        int child = Integer.parseInt(inputDot("소아"));
        String baby = inputDot("유아");

        String personCk = inputDot("입력하신 인원이 맞는지 확인해주세요. (Y/N)\n" +
            "[ 성인: " + adult + ", 소아: " + child + ", 유아: " + baby + " ]\n");

        // 소문자 입력
        if (personCk.equalsIgnoreCase("Y")) {
          tk.setPassenger(adult + child);
          return adult + (child / 2);
        }
      } catch (NumberFormatException e) {
        System.out.println("*** 숫자를 입력해주세요 ***");
      }

    }
  }

  private static void date() {
    LocalDate today = LocalDate.now();
    LocalDate go = null;
    String goInput = "230411";
    while (true) {
      System.out.println("오늘 날짜 " + today);
      goInput = input("\n# 가는날 \n여섯자리를 정확히 입력해주세요(ex." + today + ")");
      if (goInput.length() != 6) {
        System.out.println("6자리 입력해주세요");
        continue;
      }
      try {
        int yymmdd = Integer.parseInt(goInput);
        int year = yymmdd / 10000 + 2000;
        yymmdd %= 10000;
        int month = yymmdd / 100;
        yymmdd %= 100;
        int day = yymmdd;

        go = LocalDate.of(year, month, day);
        long between = ChronoUnit.DAYS.between(today, go);
        if (between < 0) {
          System.out.println("현재 날짜 전으로는 예매가 불가능합니다.");
          continue;
        }
        System.out.println("go = " + go);
        break;
      } catch (NumberFormatException e) {
        Utility.inputError();
        continue;
      } catch (DateTimeException e) {
        System.out.println("날짜 입력 오류!! 다시 입력해주세요");
        continue;
      }
    }
    LocalDate comeBack = null;
    System.out.println();
    while (true) {
      String comeBackInput
          = input("\n# 오는날 \n여섯자리를 정확히 입력해주세요(ex." + today + ")");
      if (comeBackInput.length() != 6) {
        System.out.println("6자리 입력해주세요");
        continue;
      }
      try {
        int yymmdd = Integer.parseInt(comeBackInput);
        int year = yymmdd / 10000 + 2000;
        yymmdd %= 10000;
        int month = yymmdd / 100;
        yymmdd %= 100;
        int day = yymmdd;

        comeBack = LocalDate.of(year, month, day);
        long between = ChronoUnit.DAYS.between(go, comeBack);
        if (between < 0) {
          System.out.println("가는 날짜 이전으로의 예매는 불가능합니다.");
          System.out.println("가는 날짜 : " + go);
          continue;
        }
        System.out.println("comeBack = " + comeBack);
        tk.setGo(go);
        tk.setComeback(comeBack);
        break;
      } catch (NumberFormatException e) {
        Utility.inputError();
        continue;
      } catch (DateTimeException e) {
        System.out.println("날짜 입력 오류!! 다시 입력해주세요");
        continue;
      }
    }

    // ㅇㅇㅇ
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
