package factory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("方形生成中");
    }

    @Override
    public void erase() {

    }
}
