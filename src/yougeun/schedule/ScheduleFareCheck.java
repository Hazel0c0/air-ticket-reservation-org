package yougeun.schedule;


import jdk.jshell.execution.Util;
import jiwon.airlineStatus.AirlineInfo;
import jiwon.airlineStatus.City;
//import jiwon.airlineStatus.StatusRepository;
import yougeun.Utility;


import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

// 스케줄 운임 조회
public class ScheduleFareCheck {
    public static void menu(){
        Utility.topBar();
        System.out.println("=== 스케줄/운임 조회 페이지 ===");
//        Map<String, Country> countryMap = CountryRepository.getCountryMap();
        List<City> city = AirlineInfo.getCity();
        while (true) {
            int i=0;
            for (City city1 : city) {
                System.out.print(city1.getCountryName() + ", ");
                i++;
                if(i%5==0) System.out.println();
            }
//            for (String s : countryMap.keySet()) {
//                System.out.print(s + " ");
//                i++;
//                if(i%5==0) System.out.println();
//            }
            System.out.println();
            Utility.makeLine();
            System.out.println("도착지를 입력해주세요!");
            String inputCountry = Utility.input("ex)인천공항-(  )공항을 입력해주세요");

            List<City> cities = city.stream()
                    .filter(c -> c.getCountryName().equals(inputCountry))
                    .collect(Collectors.toList());
            City city2 = cities.get(0);

            if(!city2.getCountryName().equals(inputCountry)){
                System.out.println("해당 데이터는 없습니다. 다시 입력해주세요.");
                Utility.stop();
                continue;
            }

//            for (City city1 : city) {
//                if(city1.getCountryName().equals(inputCountry))
//
//            }
//
//            if(!countryMap.containsKey(inputCountry)) {
//                System.out.println("해당 데이터는 없습니다. 다시 입력해주세요.");
//                Utility.stop();
//                continue;
//            }
//
//            Country country =  countryMap.get(inputCountry);
            System.out.println("인천공항-" + inputCountry + " 운임 조회입니다.(편도)");
            System.out.println("ECONOMY 석 : " + NumberFormat.getInstance(Locale.getDefault()).format(city2.getFee())+"원");
            System.out.println("PRESTIGE 석 :" + NumberFormat.getInstance(Locale.getDefault()).format((int)(city2.getFee()*1.5))+"원" );
            System.out.println("FIRST 석 : " + NumberFormat.getInstance(Locale.getDefault()).format(city2.getFee()* 2L)+"원");
            break;
        }
    }

}
