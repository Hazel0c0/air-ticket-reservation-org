package jiwon.airlineStatus;

import jiwon.enumset.Grade;
import jiwon.enumset.Way;

import static yougeun.Utility.input;
import static yougeun.Utility.inputDot;

public class Test {
//  static AirlineRepository ar;
//
//  static {
//    ar = new AirlineRepository();
//  }
  public static void main(String[] args) {

//    System.out.println("# 여행 할 도시 선택을 도와드릴게요");
//    System.out.println("  1. 지금! 인기 여행지");
//    System.out.println("  2. 테마별 여행지");
//    System.out.println("  3. 전체 도시 보기");
//
//    ar.destination(input("\n 번호를 선택해주세요"));

      new AirlineSearchView().searchView();

    /*
    String inputGrade = input("좌석 등급을 선택해주세요\n" +
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

     */
  }
}
