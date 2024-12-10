package LLDDesigns.CreationalPattern.FactoryPattern;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("rectangle").draw();
    }
}
