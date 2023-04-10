package yougeun.airlineInfo;

public class Checkin {
    private String counter; // 체크인 카운터
    private String open; // 오픈 시간
    private String close; // 클로즈 시간
    private boolean isKiosk; // 키오스크 여부
    private boolean isMobile; // 모바일 탑승권 여부
    private String contact; // 연락처

    public Checkin(String counter, String open, String close, boolean isKiosk, boolean isMobile, String contact) {
        this.counter = counter;
        this.open = open;
        this.close = close;
        this.isKiosk = isKiosk;
        this.isMobile = isMobile;
        this.contact = contact;
    }

    public String getCounter() {
        return counter;
    }

    public String getOpen() {
        return open;
    }

    public String getClose() {
        return close;
    }

    public boolean isKiosk() {
        return isKiosk;
    }

    public boolean isMobile() {
        return isMobile;
    }

    public String getContact() {
        return contact;
    }
}
