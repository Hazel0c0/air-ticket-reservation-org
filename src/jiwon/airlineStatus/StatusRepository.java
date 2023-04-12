package jiwon.airlineStatus;

import yougeun.country.Country;

import java.util.ArrayList;
import java.util.List;

import static jiwon.enumset.Continent.*;
import static jiwon.enumset.Theme.*;

public class StatusRepository {
  static List<City> city;

  // 편도 가격, 좌석 등급마다 1배, 1.5배, 2배 *2
  static {
    city = new ArrayList<>();
//        테마 입력 안할경우 '노말'로 설정됨
    /* "타이페이","제주공항" */
    new Country("부산", 5000, DOMESTIC);
    new Country("제주", 75000, DOMESTIC);
    new Country("상하이", 210000, CHINA);
    new Country("베이징", 250000, CHINA);
    new Country("칭다오", 245000, CHINA);
    new Country("선양", 232000, CHINA);
    new Country("광저우", 210000, CHINA);
    new Country("홍콩", 200000, CHINA, POPULARITY);
    new Country("마카오", 150000, CHINA);
    new Country("오사카", 178000, JAPAN, POPULARITY);
    new Country("도쿄", 157600, JAPAN, POPULARITY);
    new Country("후쿠오카", 183200, JAPAN, POPULARITY);
    new Country("오키나와 나하", 124900, JAPAN, POPULARITY);
    new Country("삿포로", 103300, JAPAN);
    new Country("나고야", 184900, JAPAN);
    new Country("하노이", 224900, SOUTHEAST_ASIA);
    new Country("다낭", 243800, SOUTHEAST_ASIA);
    new Country("방콕", 283300, SOUTHEAST_ASIA, POPULARITY);
    new Country("마닐라", 310000, SOUTHEAST_ASIA);
    new Country("세부", 323000, SOUTHEAST_ASIA);
    new Country("발리", 340000, SOUTHEAST_ASIA);
    new Country("로스엔젤레스", 625000, AMERICA);
    new Country("뉴욕", 680000, AMERICA);
    new Country("시애틀", 450000, AMERICA);
    new Country("토론토", 880000, AMERICA);
    new Country("벤쿠버", 910000, AMERICA);
    new Country("블라디보스토크", 320000, EUROPE);
    new Country("파리", 376000, EUROPE);
    new Country("런던", 820000, EUROPE);
    new Country("로마", 760000, EUROPE);
    new Country("프라하", 650000, EUROPE);
    new Country("괌 A.B. 원팟", 222000, OCEANIA, POPULARITY);
    new Country("사이판", 338000, OCEANIA);
    new Country("시드니", 620000, OCEANIA);
    new Country("오클랜드", 450000, OCEANIA);
  }


}