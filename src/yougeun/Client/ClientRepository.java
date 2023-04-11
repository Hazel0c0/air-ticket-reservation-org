package yougeun.Client;

import java.util.ArrayList;
import java.util.Arrays;

public class ClientRepository {
    static private ArrayList<Client> clientArrayList;

    static {
        clientArrayList = new ArrayList<>(
                Arrays.asList(new Client("감사", Gender.MALE, "019-1111-1111", "gamsa@naver.com", "청주", "gamsa", "gamsa"),
                        new Client("자바", Gender.FEMALE, "019-2222-2222", "java@naver.com", "수원", "java", "java", true),
                        new Client("하나", Gender.FEMALE, "019-3333-3333", "one@naver.com", "서울", "one", "one"),
                        new Client("둘", Gender.MALE, "019-4444-4444", "two@naver.com", "대구", "two", "two"),
                        new Client("셋", Gender.MALE, "019-5555-5555", "three@naver.com", "대전", "three", "three"))
        );
    }

    public static ArrayList<Client> getClientArrayList() {
        return clientArrayList;
    }

    public ClientRepository() {
    }

//    public static void main(String[] args) {
//        for (Client client : clientArrayList) {
//            System.out.println(client);
//        }
//    }


}
