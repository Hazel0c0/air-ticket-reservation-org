package yougeun.country;

import jiwon.enumset.Continent;
import jiwon.enumset.Theme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static jiwon.enumset.Continent.*;
import static jiwon.enumset.Theme.*;

public class CountryRepository {
    static final Map<String, Country> countryMap;
    // 편도 가격, 좌석 등급마다 1배, 1.5배, 2배 *2
    static {
        countryMap = new HashMap<>();
//        테마 입력 안할경우 '노말'로 설정됨
        /*
                , "타이페이",
            , "제주공항" , "\
         */
        countryMap.put("상하이", new Country("상하이", 210000, CHINA));
        countryMap.put("베이징", new Country("베이징", 250000, CHINA));
        countryMap.put("칭다오", new Country("칭다오", 245000, CHINA));
        countryMap.put("선양", new Country("선양", 232000, CHINA));
        countryMap.put("광저우", new Country("광저우", 210000, CHINA));
        countryMap.put("홍콩", new Country("홍콩", 200000, CHINA,POPULARITY));
        countryMap.put("마카오", new Country("마카오", 150000, CHINA));
        countryMap.put("오사카", new Country("오사카", 178000, JAPAN,POPULARITY));
        countryMap.put("도쿄", new Country("도쿄", 157600, JAPAN,POPULARITY));
        countryMap.put("후쿠오카", new Country("후쿠오카", 183200, JAPAN,POPULARITY));
        countryMap.put("오키나와", new Country("오키나와 나하", 124900, JAPAN,POPULARITY));
        countryMap.put("삿포로", new Country("삿포로", 103300, JAPAN));
        countryMap.put("나고야", new Country("나고야", 184900, JAPAN));
        countryMap.put("하노이", new Country("하노이", 224900, SOUTHEAST_ASIA));
        countryMap.put("다낭", new Country("다낭", 243800, SOUTHEAST_ASIA));
        countryMap.put("방콕", new Country("방콕", 283300, SOUTHEAST_ASIA,POPULARITY));
        countryMap.put("마닐라", new Country("마닐라", 310000, SOUTHEAST_ASIA));
        countryMap.put("세부", new Country("세부", 323000, SOUTHEAST_ASIA));
        countryMap.put("발리", new Country("발리", 340000, SOUTHEAST_ASIA));
        countryMap.put("로스엔젤레스", new Country("로스엔젤레스", 625000, AMERICA));
        countryMap.put("뉴욕", new Country("뉴욕", 680000, AMERICA));
        countryMap.put("시애틀", new Country("시애틀", 450000, AMERICA));
        countryMap.put("토론토", new Country("토론토", 880000, AMERICA));
        countryMap.put("벤쿠버", new Country("벤쿠버", 910000, AMERICA));
        countryMap.put("블라디보스토크", new Country("블라디보스토크", 320000, EUROPE));
        countryMap.put("파리", new Country("파리", 376000, EUROPE));
        countryMap.put("런던", new Country("런던", 820000, EUROPE));
        countryMap.put("로마", new Country("로마", 760000, EUROPE));
        countryMap.put("프라하", new Country("프라하", 650000, EUROPE));
        countryMap.put("괌", new Country("괌 A.B. 원팟", 222000, OCEANIA,POPULARITY));
        countryMap.put("사이판", new Country("사이판", 338000, OCEANIA));
        countryMap.put("시드니", new Country("시드니", 620000, OCEANIA));
        countryMap.put("오클랜드", new Country("오클랜드", 450000, OCEANIA));
    }


}