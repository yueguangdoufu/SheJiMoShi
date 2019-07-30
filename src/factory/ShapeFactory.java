package factory;

public class ShapeFactory {
    public static Shape produceShape(String shape) throws Exception {
        if(shape.equalsIgnoreCase("circle")){
            System.out.println("圆形工厂生成圆形");
            return new Circle();
        }else if(shape.equalsIgnoreCase("square")){
            System.out.println("方形工厂生产方形");
            return new Square();
        }else if(shape.equalsIgnoreCase("triangle")){
            System.out.println("三角工厂");
            return new Triangle();
        }else {
            throw new Exception("对不起，无法生存");
        }
    }
}
