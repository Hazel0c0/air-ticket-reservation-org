package yougeun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utility {
    static BufferedReader br;
    public static double battery = 100;

    static{
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    // 멈추는 기능
    public static void stop(){
        try {
            System.out.println("계속 실행하시려면 enter를 눌러주세요!");
            br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean stopInput(String s){
        try {
            System.out.println(s);
            if(br.readLine().equalsIgnoreCase("0"))
                return false;
            return true;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // 공백을 출력하는 함수
    public static void empty(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void empty2(){System.out.print("\n");}


    // 입력 받은 문자가 #인지 확인하는 함수, true면 스킵 기능으로 씀.
    public static boolean skip(char a){
        return a == '#';
    }

    /**
     * 입력을 받는 함수입니다.
     * @param s 입력을 받는 정보를 받는 파라미터
     * @return 사용자 입력을 받아 리턴해주는 함수
     */
    public static String input(String s){
        System.out.println(s);
        System.out.print(">>");
        try {
            return br.readLine();
        } catch (IOException e) {
            System.out.println("입출력 오류입니다.");
            e.printStackTrace();
            return "error";
        }
    }
    public static String inputDot(String s){
        System.out.print(s);
        System.out.print(": ");
        try {
            return br.readLine();
        } catch (IOException e) {
            System.out.println("입출력 오류입니다.");
            e.printStackTrace();
            return "error";
        }
    }

    // 사용자 입력 오류가 생길 때 오류 메시지를 출력하는 함수
    public static void inputError(){
        System.out.println("지원되지 않는 명령어입니다.");
    }

    public static void makeLine() {
        System.out.println("----------------------------------");
    }

    public static void topBar() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println("╔═════════════════════════════════════╗");
        System.out.println("soon9 "+ now.format(dateTimeFormatter) +" ▁▂▃▅▆▇ "+ String.format("%.1f", battery) + "%");
        System.out.println("╚═════════════════════════════════════╝");
        battery-=0.1;
    }

}
