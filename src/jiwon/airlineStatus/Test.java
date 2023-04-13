

package jiwon.airlineStatus;


import java.util.List;

import static java.util.stream.Collectors.toList;
import static jiwon.airlineStatus.AirlineInfo.city;
import static yougeun.Utility.makeLine;

public class Test {

  public static void main(String[] args) {
//    City findCity = city.stream()
//        .filter(c -> c.getCountryName().equals("제주"))
//        .findFirst().get();
//
//    findCity.cityView();
//    System.out.println(pickCity);

    AirlineSearchView.searchView();
  }


}

