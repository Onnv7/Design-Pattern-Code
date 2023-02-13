import Shape.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println(clonedShape.getType() + clonedShape.getClass().toString());
    }
}
