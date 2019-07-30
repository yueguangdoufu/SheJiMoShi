package observer;

public class Client {
    public static void main(String[] args) {
        MySubject subject  = new GuShi();

        MyObserver observer1,observer2;

        observer1 = new GuMingA();
        observer2 = new GuMingB();

        subject.attach(observer1);
        subject.attach(observer2);

        subject.price();
    }
}
