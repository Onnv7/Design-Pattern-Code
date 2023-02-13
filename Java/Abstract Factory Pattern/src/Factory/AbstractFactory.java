package Factory;

import Shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String name);

}
