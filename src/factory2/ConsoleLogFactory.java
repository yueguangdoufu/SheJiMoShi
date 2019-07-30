package factory2;

public class ConsoleLogFactory implements LogFactory {
    @Override
    public Log produceLog() {
        System.out.println("生成控制台日志");
        return new ConsoleLog();
    }
}
