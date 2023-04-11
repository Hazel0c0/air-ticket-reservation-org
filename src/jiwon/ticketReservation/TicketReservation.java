package jiwon.ticketReservation;

import yougeun.Utility;

import static yougeun.Utility.*;

public class TicketReservation {
  void ReservationPage() {
    makeLine();
    System.out.println("로그인하고 더 편리하게 예약하세요");
    System.out.println(
        "  * 개인 정보 저장으로 다음 예약을 더 편리하게\n" +
            "  * 여러 승객의 정보까지 자동 완성\n" +
            "  * 지난 예약과 현재 예약을 한 눈에 확인");
    makeLine();
    inputDot("로그인 하시겠습니까? [Y/N] ");

    System.out.println("\n# 연락처 세부정보");
    inputDot("이메일");
    inputDot("전화번호");

    System.out.println("\n# 예약 당사자 탑승객 정보를 입력해주세요." +
        "\n※ 탑승 시 문제가 생기지 않도록 여권에 기재된 영문 성명을 그대로 입력해 주세요");
    inputDot("성 (예: Chae)");
    inputDot("이름 (예: Jiwon)");
    inputDot("국적");
    input("성별 1.남자  2.여자");
    inputDot("생년월일");
    inputDot("여권 또는 신분증 번호");

    //    기내 또는 휴대 수하물
    System.out.println();
    makeLine();
    System.out.println("# 휴대 수하물 번들");
    System.out.println("1x 개인 소지품(2kg) + 1x 기내 수하물(8kg)");
    System.out.println("      40x15x35cm       55x20x40cm");
    makeLine();
    stop();

//    위탁 수하물
    makeLine();
    System.out.println("# 1x 위탁 수하물");
    System.out.println("15kg");
    System.out.println("99x38x66cm");
    System.out.println("\n팁: 위탁 수하물을 추가해 안심하고 여행하세요.\n" +
        "가볍게 기내에 탑승해 더욱 편안하게 여행하실 수 있답니다.");
    makeLine();
    input("\n# 위탁 수하물을 신청 하시겠습니까? ($89997)" +
        "\n [Y/N]");

//    여행자 보험

    input("예약에 여행객을 추가하시겠어요? [Y/N]");
  }
}
