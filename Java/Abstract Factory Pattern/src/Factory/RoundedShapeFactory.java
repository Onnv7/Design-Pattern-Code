package Factory;

import Shape.RoundedRectangle;
import Shape.RoundedSquare;
import Shape.Shape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String name) {
        if (name.equalsIgnoreCase("rectangle")) {
            return new RoundedRectangle();
        } else if (name.equalsIgnoreCase("square")) {
            return new RoundedSquare();
        }
        return null;
    }
}
