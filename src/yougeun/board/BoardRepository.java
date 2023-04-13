package yougeun.board;

import java.util.HashMap;
import java.util.Map;

public class BoardRepository {
    private static int i=0;
    static Map<Integer, BoardVO> map = new HashMap<>() {{
        for (i = 1; i < 53; i++) {
             put(i, new BoardVO("test title hihi","gangi","대한민국은 통일을 지향하며, 자유민주적 기본질서에 입각한 평화적 통일 정책을 수립하고 이를 추진한다. 군인·군무원·경찰공무원 기타 법률이 정하는 자가 전투·훈련등 직무집행과 관련하여 받은 손해에 대하여는 법률이 정하는 보상외에 국가 또는 공공단체에 공무원의 직무상 불법행위로 인한 배상은 청구할 수 없다.   "));
        }
    }};

    static {
        map.put(i++, new BoardVO("Incheon-Haneda daily service on May 1st", "Admin", "상기 스케줄의 경우 정부인가 조건 으로 운항 예정이며, 시장상황 변동에 따라 예약 이후에도 운항 변경 될 수 있습니다."));
        map.put(i++, new BoardVO("Information on changing the website's privacy policy", "Admin", "국회의원은 법률이 정하는 직을 겸할 수 없다. 일반사면을 명하려면 국회의 동의를 얻어야 한다. 명령·규칙 또는 처분이 헌법이나 법률에 위반되는 여부가 재판의 전제가 된 경우에는 대법원은 이를 최종적으로 심사할 권한을 가진다."));
        map.put(i++, new BoardVO("Amore Beauty Mileage Usage Event Guide", "Admin", "모든 국민은 사생활의 비밀과 자유를 침해받지 아니한다. 대법관은 대법원장의 제청으로 국회의 동의를 얻어 대통령이 임명한다. 국가는 사회보장·사회복지의 증진에 노력할 의무를 진다."));
        map.put(i++, new BoardVO("Simmons Bed Asiana Mileage Accrual Partnership Announcement", "Admin", "대법관의 임기는 6년으로 하며, 법률이 정하는 바에 의하여 연임할 수 있다. 대통령은 법률안의 일부에 대하여 또는 법률안을 수정하여 재의를 요구할 수 없다."));
        map.put(i++, new BoardVO("Domestic fuel surcharge (May 2023)", "Admin", "국민의 자유와 권리는 헌법에 열거되지 아니한 이유로 경시되지 아니한다. 국가는 농수산물의 수급균형과 유통구조의 개선에 노력하여 가격안정을 도모함으로써 농·어민의 이익을 보호한다."));
        map.put(i++, new BoardVO("Saipan resumes flights on April 27th! Travel with a special fare", "Admin", "군인·군무원·경찰공무원 기타 법률이 정하는 자가 전투·훈련등 직무집행과 관련하여 받은 손해에 대하여는 법률이 정하는 보상외에 국가 또는 공공단체에 공무원의 직무상 불법행위로 인한 배상은 청구할 수 없다."));
        map.put(i++, new BoardVO("Announcement of the end of the Daiso Mall mileage accumulation partnership", "Admin", "국회에서 의결된 법률안은 정부에 이송되어 15일 이내에 대통령이 공포한다. 대통령의 임기는 5년으로 하며, 중임할 수 없다. 모든 국민은 인간다운 생활을 할 권리를 가진다."));
        map.put(i++, new BoardVO("Star Alliance Recommendation Rate (NPS) Survey", "Admin", "대통령후보자가 1인일 때에는 그 득표수가 선거권자 총수의 3분의 1 이상이 아니면 대통령으로 당선될 수 없다. 언론·출판은 타인의 명예나 권리 또는 공중도덕이나 사회윤리를 침해하여서는 아니된다. 언론·출판이 타인의 명예나 권리를 침해한 때에는 피해자는 이에 대한 피해의 배상을 청구할 수 있다."));
        map.put(i++, new BoardVO("Up to 10% discount on Fukuoka special flights in May and 10,000 miles refund event for mileage tickets", "Admin", "탄핵결정은 공직으로부터 파면함에 그친다. 그러나, 이에 의하여 민사상이나 형사상의 책임이 면제되지는 아니한다. 국무회의는 정부의 권한에 속하는 중요한 정책을 심의한다."));
        map.put(i++, new BoardVO("Okinawa, get 5% off and travel", "Admin", "비상계엄이 선포된 때에는 법률이 정하는 바에 의하여 영장제도, 언론·출판·집회·결사의 자유, 정부나 법원의 권한에 관하여 특별한 조치를 할 수 있다."));
        map.put(i++, new BoardVO("Incheon ↔ New York passengers can use the New Jersey/Philadelphia shuttle bus", "Admin", "탄핵결정은 공직으로부터 파면함에 그친다. 그러나, 이에 의하여 민사상이나 형사상의 책임이 면제되지는 아니한다. 형사피해자는 법률이 정하는 바에 의하여 당해 사건의 재판절차에서 진술할 수 있다."));
    }


    public static Map<Integer, BoardVO> getMap() {
        return map;
    }
}
