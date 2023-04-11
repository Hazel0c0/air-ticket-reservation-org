package yougeun.checkin;

public class Test {
    public static void main(String[] args) {
        boolean seatTest[][] = SeatVO.getSeat();
        System.out.println("■ 예약 불가, □ 예약 가능");
        int i=1;
        System.out.println("    A B C D E F");
        for (boolean[] booleans : seatTest) {
            System.out.print(i + " : ");
            i++;
            for (boolean aBoolean : booleans) {
                if(aBoolean){
                    System.out.print("■ ");
                } else{
                    System.out.print("□ ");
                }
            }
            System.out.println();
        }


    }
}
