package factory3;

public class PcFactory implements CFactory{
    @Override
    public Cpu produceCpu() {
        return new PcCpu();
    }

    @Override
    public Ram produceRam() {
        return new PcRam();
    }
}
