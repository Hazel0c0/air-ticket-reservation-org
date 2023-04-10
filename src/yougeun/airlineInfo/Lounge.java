package yougeun.airlineInfo;

public class Lounge {
    private String name; // 라운지명
    private String position; // 위치정보
    private String operatingTime; // 운영 시간

    public Lounge(String name, String position, String operatingTime) {
        this.name = name;
        this.position = position;
        this.operatingTime = operatingTime;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getOperatingTime() {
        return operatingTime;
    }
}
