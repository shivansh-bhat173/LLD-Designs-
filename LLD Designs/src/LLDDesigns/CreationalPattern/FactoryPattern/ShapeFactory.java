package LLDDesigns.CreationalPattern.FactoryPattern;

public class ShapeFactory {

    public Shape getShape(String shape){

        switch(shape){

            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
            return new Square();
            default:
                System.out.println("Invalid Shape");
                break;
        }
        return null;
    }
}
