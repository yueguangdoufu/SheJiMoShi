package waiguan;

public class HardDisk {

    public boolean read(int a){

        if(a == 1){
            System.out.println("读取硬件");
            return true;
        }else {
            System.out.println("读取硬件失败");
            return false;
        }
    }
}
