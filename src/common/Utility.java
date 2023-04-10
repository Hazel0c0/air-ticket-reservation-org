package common;

import java.util.Scanner;


public class Utility {

  private static Scanner sc = new Scanner(System.in);

  private Utility() {}

  // 구분선을 출력하는 기능
  public static void makeLine() {
    System.out.println("========================");
  }

  // 문자열을 입력받는 기능
  public static String input(String message) {
    System.out.print(message);
    return sc.nextLine();
  }
}