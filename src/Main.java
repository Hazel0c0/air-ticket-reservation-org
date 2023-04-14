import dongwoo.ClientView;
import jiwon.airlineStatus.AirlineRepository;
import jiwon.enumset.Continent;
import yougeun.Client.Client;
import yougeun.SamjoAirLine;

public class Main {
    public static void main(String[] args) {
//        AirlineRepository ar = new AirlineRepository();
//        ar.choiceCity(Continent.DOMESTIC);
        while (true) {
            ClientView clientView = new ClientView();
            Client client = clientView.viewProcess();
            SamjoAirLine.run(client);
        }
    }
}