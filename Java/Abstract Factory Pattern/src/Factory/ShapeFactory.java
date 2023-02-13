package Factory;

import Shape.Rectangle;
import Shape.*;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String name) {
        if (name.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (name.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;

    }
}
