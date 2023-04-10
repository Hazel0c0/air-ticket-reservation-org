package yougeun.board;

import java.util.HashMap;
import java.util.Map;

public class BoardRepository {
    private static int i=0;
    static Map<Integer, BoardVO> map = new HashMap<>() {{
        for (i = 1; i < 53; i++) {
             put(i, new BoardVO("test title hihi","gangi","asdsad"));
        }
    }};

    static {
        map.put(i++, new BoardVO("Incheon-Haneda daily service on May 1st", "Admin", "상기 스케줄의 경우 정부인가 조건 으로 운항 예정이며, 시장상황 변동에 따라 예약 이후에도 운항 변경 될 수 있습니다."));
        map.put(i++, new BoardVO("Information on changing the website's privacy policy", "Admin", "123213"));
        map.put(i++, new BoardVO("Amore Beauty Mileage Usage Event Guide", "Admin", "123213"));
        map.put(i++, new BoardVO("Simmons Bed Asiana Mileage Accrual Partnership Announcement", "Admin", "123213"));
        map.put(i++, new BoardVO("Domestic fuel surcharge (May 2023)", "Admin", "123213"));
        map.put(i++, new BoardVO("Saipan resumes flights on April 27th! Travel with a special fare", "Admin", "123213"));
        map.put(i++, new BoardVO("Announcement of the end of the Daiso Mall mileage accumulation partnership", "Admin", "123213"));
        map.put(i++, new BoardVO("Star Alliance Recommendation Rate (NPS) Survey", "Admin", "123213"));
        map.put(i++, new BoardVO("Up to 10% discount on Fukuoka special flights in May and 10,000 miles refund event for mileage tickets", "Admin", "123213"));
        map.put(i++, new BoardVO("Okinawa, get 5% off and travel", "Admin", "123213"));
        map.put(i++, new BoardVO("Incheon ↔ New York passengers can use the New Jersey/Philadelphia shuttle bus", "Admin", "123213"));
    }








}
