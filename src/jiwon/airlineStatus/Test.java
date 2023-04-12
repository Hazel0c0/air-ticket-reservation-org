

package jiwon.airlineStatus;


import java.util.List;

import static java.util.stream.Collectors.toList;
import static jiwon.airlineStatus.AirlineRepository.from;
import static jiwon.airlineStatus.StatusRepository.city;
import static jiwon.enumset.Theme.POPULARITY;
import static yougeun.Utility.inputDot;
import static yougeun.Utility.makeLine;

public class Test {

  public static void main(String[] args) {
// 스트링 리스트로 새로 담기
//    List<String> theme= city.stream()
//        .filter(popul -> popul.getTheme() == POPULARITY)
//        .collect(toList());
//    System.out.println(theme);

    AirlineSearchView.searchView();
  }

}

