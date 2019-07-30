package zhuangshi;

public class Client {

    public static void main(String[] args) {
        Phone phone;
        phone = new SimplePhone();
        phone.call();
        System.out.println("----------------");
        JarPhone jarPhone = new JarPhone(phone);
        jarPhone.call();
        jarPhone.zhendong();
        System.out.println("-------------------");
        ComplexPhone complexPhone = new ComplexPhone(phone);
        complexPhone.call();
        complexPhone.shanshuo();
    }
}
