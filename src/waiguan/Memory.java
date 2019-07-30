package waiguan;

public class Memory {
    public boolean check(int a){

        if(a == 1){
            System.out.println("检查内存");
            return true;
        }else {
            System.out.println("内存出错");
            return false;
        }
    }
}
