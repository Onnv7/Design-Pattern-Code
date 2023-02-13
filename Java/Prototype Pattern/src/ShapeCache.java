import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

import Shape.Circle;
import Shape.Shape;
import Shape.Square;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String id) {
        Shape cachedShape = shapeMap.get(id);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");

        shapeMap.put("1", circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put("2", square);
    }
}