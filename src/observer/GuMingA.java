package observer;

public class GuMingA implements MyObserver {
    @Override
    public void response() {
        System.out.println("A哭了");
    }
}
