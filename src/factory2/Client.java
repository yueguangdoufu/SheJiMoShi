package factory2;

public class Client {
    public static void main(String[] args) {
        Log log;
        LogFactory logFactory;
        logFactory = (LogFactory) XmlUtil.getBean();
        log = logFactory.produceLog();
        log.show();
    }
}
