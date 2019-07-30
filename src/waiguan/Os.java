package waiguan;

public class Os {
    public boolean load(int a){

        if(a == 1){
            System.out.println("加载操作系统");
            return true;
        }else {
            System.out.println("加载操作系统失败");
            return false;
        }
    }
}
