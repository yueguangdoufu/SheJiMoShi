package waiguan;

public class Cpu {
    public boolean run(int a){

        if(a == 1){
            System.out.println("运行cpu");
            return true;
        }else {
            System.out.println("运行cpu失败");
            return false;
        }
    }
}
