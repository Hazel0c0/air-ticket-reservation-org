package yougeun.checkin;

public class SeatVO {

    private static boolean seat[][];
    static {
        seat = new boolean[9][6];
        for (int i = 0; i < seat.length; i++) {
            for(int j=0; j<seat[i].length; j++){
                if(i%2==0 || j%3==0){
                    seat[i][j]=true;
                }
            }
        }
    }
    public static boolean[][] getSeat() {
        return seat;
    }
}
