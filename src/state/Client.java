package state;

public class Client {
    public static void main(String[] args) {
        GameAccount account = new GameAccount("zs");
         account.play(20);
         account.play(89);
         account.doubleScore(1000);
         account.changeCards(1000);
         account.changeCards(4000);
         account.peekCards(1);
    }
}
