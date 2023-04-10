package yougeun.airlineInfo;

public class AirlineVO {
    private String name;
    private String position;
    private String website;
    private Lounge lounge;
    private Checkin checkin;

    public AirlineVO(String name, String position, String website, Lounge lounge, Checkin checkin) {
        this.name = name;
        this.position = position;
        this.website = website;
        this.lounge = lounge;
        this.checkin = checkin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Lounge getLounge() {
        return lounge;
    }

    public void setLounge(Lounge lounge) {
        this.lounge = lounge;
    }

    public Checkin getCheckin() {
        return checkin;
    }

    public void setCheckin(Checkin checkin) {
        this.checkin = checkin;
    }
}
