package factory2;

public class FileLogFactory implements LogFactory {
    @Override
    public Log produceLog() {
        System.out.println("文件日志生成");
        return new FileLog();
    }
}
