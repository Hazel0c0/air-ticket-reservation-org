package yougeun.country;


public class Country {
    private String countryName;
    private int fee;    // 편도 요금

    public Country(String countryName, int fee) {
        this.countryName = countryName;
        this.fee = fee;
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
}