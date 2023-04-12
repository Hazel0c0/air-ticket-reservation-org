package yougeun.country;

import jiwon.enumset.Continent;
import jiwon.enumset.Theme;

public class Country {
  private String countryName;
  private int fee;    // 편도 요금
  private Continent continent;  // 대륙
  private Theme theme;  //테마

  public Country() {
  }

  public Country(String countryName, int fee, Continent continent) {
    this.countryName = countryName;
    this.fee = fee;
    this.continent = continent;
    this.theme =Theme.NORMAL;
  }

  public Country(String countryName, int fee, Continent continent, Theme theme) {
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

  public Continent getContinent() {
    return continent;
  }

  public void setContinent(Continent continent) {
    this.continent = continent;
  }

  public Theme getTheme() {
    return theme;
  }

  public void setTheme(Theme theme) {
    this.theme = theme;
  }
}