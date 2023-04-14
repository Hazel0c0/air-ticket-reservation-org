import dongwoo.ClientView;
import yougeun.Client.Client;
import yougeun.SamjoAirLine;

public class Main {
    public static void main(String[] args) {
        ClientView clientView =new ClientView();
        Client client = clientView.viewProcess();
        SamjoAirLine.run(client);
    }
}