package jiwon.airlineStatus;


import java.util.ArrayList;
import java.util.List;

import static jiwon.enumset.Continent.*;
import static jiwon.enumset.Theme.*;

public class AirlineInfo {
  static List<City> city;

  // 편도 가격, 좌석 등급마다 1배, 1.5배, 2배 *2
  static {
    city = new ArrayList<>(
        List.of(
//        테마 입력 안할경우 '노말'로 설정됨
            /* "타이페이","제주공항" */
            new City("부산", 5000, DOMESTIC),
            new City("제주", 75000, DOMESTIC),
            new City("상하이", 210000, CHINA),
            new City("베이징", 250000, CHINA),
            new City("칭다오", 245000, CHINA),
            new City("선양", 232000, CHINA),
            new City("광저우", 210000, CHINA),
            new City("홍콩", 200000, CHINA, POPULARITY),
            new City("마카오", 150000, CHINA),
            new City("오사카", 178000, JAPAN, POPULARITY),
            new City("도쿄", 157600, JAPAN, POPULARITY),
            new City("후쿠오카", 183200, JAPAN, POPULARITY),
            new City("오키나와 나하", 124900, JAPAN, POPULARITY),
            new City("삿포로", 103300, JAPAN),
            new City("나고야", 184900, JAPAN, UNUSUAL),
            new City("하노이", 224900, SOUTHEAST_ASIA),
            new City("다낭", 243800, SOUTHEAST_ASIA),
            new City("방콕", 283300, SOUTHEAST_ASIA, POPULARITY),
            new City("마닐라", 310000, SOUTHEAST_ASIA),
            new City("세부", 323000, SOUTHEAST_ASIA, SEASON),
            new City("발리", 340000, SOUTHEAST_ASIA, SEASON),
            new City("로스엔젤레스", 625000, AMERICA),
            new City("뉴욕", 680000, AMERICA),
            new City("시애틀", 450000, AMERICA),
            new City("토론토", 880000, AMERICA),
            new City("벤쿠버", 910000, AMERICA),
            new City("블라디보스토크", 320000, EUROPE),
            new City("파리", 376000, EUROPE),
            new City("런던", 820000, EUROPE),
            new City("로마", 760000, EUROPE),
            new City("프라하", 650000, EUROPE),
            new City("괌 A.B. 원팟", 222000, OCEANIA, POPULARITY),
            new City("사이판", 338000, OCEANIA),
            new City("시드니", 620000, OCEANIA),
            new City("오클랜드", 450000, OCEANIA),
            new City("라스베가스", 1450000, AMERICA)
        ));
  }


}