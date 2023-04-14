import dongwoo.ClientView;
import yougeun.SamjoAirLine;

public class Main {
    public static void main(String[] args) {
        ClientView clientView =new ClientView();
        clientView.viewProcess();
        SamjoAirLine.run();
    }
}