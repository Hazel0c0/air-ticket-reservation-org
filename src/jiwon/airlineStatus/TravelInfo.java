package jiwon.airlineStatus;

import java.util.ArrayList;
import java.util.List;

public class TravelInfo {

  private String themeTitle;
  private List<String> themeContents;

  public TravelInfo(String themeTitle) {
    this.themeTitle = themeTitle;
    this.themeContents = new ArrayList<>();
  }

  public String getThemeTitle() {
    return themeTitle;
  }

  public void setThemeTitle(String themeTitle) {
    this.themeTitle = themeTitle;
  }

  public List<String> getThemeContents() {
    return themeContents;
  }

  public void setThemeContents(List<String> themeContents) {
    this.themeContents = themeContents;
  }
}
