package yougeun.Client;

public class Card {
    private String cardNum;
    private long balance;

    public Card() {
    }

    public Card(String cardNum, long balance) {
        this.cardNum = cardNum;
        this.balance = balance;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
