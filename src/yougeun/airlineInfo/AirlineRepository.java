package yougeun.airlineInfo;

import java.util.ArrayList;
import java.util.List;

public class AirlineRepository {
    private static List<AirlineVO> airlineVOList;

    static {
        airlineVOList = new ArrayList<AirlineVO>();
        airlineVOList.add(new AirlineVO("인천국제공항", "인천", "www.airport.kr",  new Lounge("인천공항 삼조 라운지", "제 1여객 터미널", "5:30~23:00"), new Checkin("제 1여객터미널 3층", "0605L 이후 상시 운영", "마지막 항공편 출발시간 50분 전까지", true, true, "82-32-744-2000")));
        airlineVOList.add(new AirlineVO("김포국제공항", "김포", "www.airport.kr/gimpo",  new Lounge("김포공항 대길이 라운지", "제 2여객 터미널", "6:00~22:00"), new Checkin("제 2여객터미널 2층", "0805L 이후 상시 운영", "마지막 항공편 출발시간 30분 전까지", true, false, "81-31-555-3000")));
        airlineVOList.add(new AirlineVO("김해국제공항", "김해", "www.airport.kr/kimhe",  new Lounge("김해공항 중길이 라운지", "제 1여객 터미널", "7:00~23:30"), new Checkin("제 3여객터미널 1층", "0735L 이후 상시 운영", "마지막 항공편 출발시간 60분 전까지", true, false, "83-30-222-4000")));
        airlineVOList.add(new AirlineVO("제주국제공항", "제주", "www.airport.kr/jeju",  new Lounge("제주공항 소길이 라운지", "제 3여객 터미널", "4:00~20:00"), new Checkin("제 2여객터미널 2층", "0625L 이후 상시 운영", "마지막 항공편 출발시간 20분 전까지", true, false, "80-29-333-5000")));
        airlineVOList.add(new AirlineVO("청주국제공항", "청주", "www.airport.kr/cheongju",  new Lounge("청주공항 라운지", "제 1여객 터미널", "5:00~23:00"), new Checkin("제 1여객터미널 3층", "0645L 이후 상시 운영", "마지막 항공편 출발시간 10분 전까지", true, false, "85-28-444-6000")));
    }

    public static List<AirlineVO> getAirlineVOList() {
        return airlineVOList;
    }
}
