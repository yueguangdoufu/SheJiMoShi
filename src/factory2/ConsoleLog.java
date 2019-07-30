package factory2;

public class ConsoleLog implements Log {
    @Override
    public void show() {
        System.out.println("控制台日志");
    }
}
