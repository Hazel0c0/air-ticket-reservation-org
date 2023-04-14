package yougeun.checkin;

public class SeatVO {

    private static boolean seat[][]; // economy, pre
    private static boolean first[][]; // first


    static {
        seat = new boolean[9][6];
        for (int i = 0; i < seat.length; i++) {
            for(int j=0; j<seat[i].length; j++){
                if(i%2==0 || j%3==0){
                    seat[i][j]=true;
                }
            }
        }

        first = new boolean[6][3];
        first[0][1] = true;

    }
    public static boolean[][] getSeat() {
        return seat;
    }
    public static boolean[][] getSeat2() {
        return first;
    }
}
