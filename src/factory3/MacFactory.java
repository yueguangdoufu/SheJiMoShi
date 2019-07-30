package factory3;

public class MacFactory implements CFactory {
    @Override
    public Cpu produceCpu() {
        return new MacCpu();
    }

    @Override
    public Ram produceRam() {
        return new MacRam();
    }
}
