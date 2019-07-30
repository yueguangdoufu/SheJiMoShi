package factory2;

public class FileLog implements Log {
    @Override
    public void show() {
        System.out.println("文件日志");
    }
}
