package zhuangshi;

public class JarPhone extends Function {
    public JarPhone(Phone phone) {
        super(phone);
        System.out.println("加入震动");
    }

    public void zhendong(){
        System.out.println("震动提示");
    }
}
