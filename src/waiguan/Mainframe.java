package waiguan;

public class Mainframe {
    private Memory memory;
    private HardDisk hardDisk;
    private Cpu cpu;
    private Os os;

    public Mainframe() {
    }

    public void on(){
        memory = new Memory();
        hardDisk = new HardDisk();
        cpu = new Cpu();
        os = new Os();
        boolean a,b,c,d;
        a = memory.check(1);
        b = hardDisk.read(1);
        c = cpu.run(1);
        d = os.load(1);
        if(a&&b&&c&&d){
            System.out.println("主机启动成功");
        }else {
            System.out.println("启动失败");
        }

    }

    public void off(){

    }
}
