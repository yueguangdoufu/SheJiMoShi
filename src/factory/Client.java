package factory;

public class Client {
    public static void main(String[] args) {
        Shape shape;
        String shapeName = XMLUtilShape.getShapeName();
        try {
            shape = ShapeFactory.produceShape(shapeName);
            shape.draw();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
