package yougeun.country;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryRepository {

    private static final Map<String, Country> countryMap;
    // 편도 가격, 좌석 등급마다 1배, 1.5배, 2배 *2
    static {
        countryMap = new HashMap<>();
        countryMap.put("상하이", new Country("상하이", 210000));
        countryMap.put("베이징", new Country("베이징", 250000));
        countryMap.put("칭다오", new Country("칭다오", 245000));
        countryMap.put("선양", new Country("선양", 232000));
        countryMap.put("광저우", new Country("광저우", 210000));
        countryMap.put("홍콩", new Country("홍콩", 200000));
        countryMap.put("마카오", new Country("마카오", 150000));
        countryMap.put("오사카", new Country("오사카", 178000));
        countryMap.put("도쿄", new Country("도쿄", 157600));
        countryMap.put("후쿠오카", new Country("후쿠오카", 183200));
        countryMap.put("오키나와", new Country("오키나와", 124900));
        countryMap.put("삿포로", new Country("삿포로", 103300));
        countryMap.put("나고야", new Country("나고야", 184900));
        countryMap.put("하노이", new Country("하노이", 224900));
        countryMap.put("다낭", new Country("다낭", 243800));
        countryMap.put("방콕", new Country("방콕", 283300));
        countryMap.put("마닐라", new Country("마닐라", 310000));
        countryMap.put("세부", new Country("세부", 323000));
        countryMap.put("발리", new Country("발리", 340000));
        countryMap.put("로스엔젤레스", new Country("로스엔젤레스", 625000));
        countryMap.put("뉴욕", new Country("뉴욕", 680000));
        countryMap.put("시애틀", new Country("시애틀", 450000));
        countryMap.put("토론토", new Country("토론토", 880000));
        countryMap.put("벤쿠버", new Country("벤쿠버", 910000));
        countryMap.put("블라디보스토크", new Country("블라디보스토크", 320000));
        countryMap.put("파리", new Country("파리", 376000));
        countryMap.put("런던", new Country("런던", 820000));
        countryMap.put("로마", new Country("로마", 760000));
        countryMap.put("프라하", new Country("프라하", 650000));
        countryMap.put("괌", new Country("괌", 222000));
        countryMap.put("사이판", new Country("사이판", 338000));
        countryMap.put("시드니", new Country("시드니", 620000));
        countryMap.put("오클랜드", new Country("오클랜드", 450000));
    }
    public static Map<String, Country> getCountryMap() {
        return countryMap;
    }

}