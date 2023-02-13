import Factory.AbstractFactory;
import Factory.FactoryProducer;
import Shape.Shape;

public class AbstractFactoryPattern {
    public static void main(String[] args) throws Exception {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();

        AbstractFactory rounedShapeFactory = FactoryProducer.getFactory(true);
        Shape shape2 = rounedShapeFactory.getShape("Rectangle");
        shape2.draw();
    }
}
