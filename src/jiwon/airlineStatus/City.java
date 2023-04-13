package jiwon.airlineStatus;

import jiwon.enumset.Theme;

public class City {
  private String countryName;
  private int fee;    // 편도 요금
  private jiwon.enumset.Continent continent;  // 대륙
  private Theme theme;  //테마

  public City() {
  }

  public City(String countryName, int fee, jiwon.enumset.Continent continent) {
    this.countryName = countryName;
    this.fee = fee;
    this.continent = continent;
    this.theme = Theme.NORMAL;
  }

  @Override
  public String toString() {
    return "City{" +
        "countryName='" + countryName + '\'' +
        ", fee=" + fee +
        ", continent=" + continent +
        ", theme=" + theme +
        '}';
  }

  public City(String countryName, int fee, jiwon.enumset.Continent continent, Theme theme) {
    this.countryName = countryName;
    this.fee = fee;
    this.continent = continent;
    this.theme = theme;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public int getFee() {
    return fee;
  }

  public void setFee(int fee) {
    this.fee = fee;
  }

  public jiwon.enumset.Continent getContinent() {
    return continent;
  }

  public void setContinent(jiwon.enumset.Continent continent) {
    this.continent = continent;
  }

  public Theme getTheme() {
    return theme;
  }

  public void setTheme(Theme theme) {
    this.theme = theme;
  }

  public Object getChoice(Object o) {
    if (o instanceof Theme) return getTheme();
    return getContinent();
  }
}
