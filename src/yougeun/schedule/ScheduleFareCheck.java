package yougeun.schedule;


import jdk.jshell.execution.Util;
import yougeun.Utility;
import yougeun.country.Country;
import yougeun.country.CountryRepository;

import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

// 스케줄 운임 조회
public class ScheduleFareCheck {

    public static void menu(){
        System.out.println("=== 스케줄/운임 조회 페이지 ===");
        Map<String, Country> countryMap = CountryRepository.getCountryMap();

        while (true) {
            int i=0;
            for (String s : countryMap.keySet()) {
                System.out.print(s + " ");
                i++;
                if(i%5==0) System.out.println();
            }
            System.out.println();
            Utility.makeLine();
            System.out.println("도착지를 입력해주세요!");
            String inputCountry = Utility.input("ex)인천공항-(  )공항을 입력해주세요");
            if(!countryMap.containsKey(inputCountry)) {
                System.out.println("해당 데이터는 없습니다. 다시 입력해주세요.");
                Utility.stop();
                continue;
            }

            Country country =  countryMap.get(inputCountry);


            System.out.println("인천공항-" + inputCountry + " 운임 조회입니다.(편도)");
            System.out.println("ECONOMY 석 : " + NumberFormat.getInstance(Locale.getDefault()).format(country.getFee())+"원");
            System.out.println("PRESTIGE 석 :" + NumberFormat.getInstance(Locale.getDefault()).format((int)(country.getFee()*1.5))+"원" );
            System.out.println("FIRST 석 : " + NumberFormat.getInstance(Locale.getDefault()).format(country.getFee()*2)+"원");
            break;
        }
    }

}
