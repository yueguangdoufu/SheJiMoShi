package factory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆形生成中");
    }

    @Override
    public void erase() {

    }
}
