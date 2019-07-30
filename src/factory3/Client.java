package factory3;

public class Client {
    public static void main(String[] args) {
        CFactory factory;
        Cpu cpu;
        Ram ram;
        factory = (CFactory) XmlUtil.getBean();
        cpu = factory.produceCpu();
        ram = factory.produceRam();
        cpu.use();
        ram.use();
    }
}
