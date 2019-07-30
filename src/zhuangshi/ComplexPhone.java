package zhuangshi;

public class ComplexPhone extends Function {
    public ComplexPhone(Phone phone) {
        super(phone);
        System.out.println("加入闪烁");
    }

    public void shanshuo(){
        System.out.println("闪烁提示");
    }

}
