package factory;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("三角生成中");
    }

    @Override
    public void erase() {

    }
}
