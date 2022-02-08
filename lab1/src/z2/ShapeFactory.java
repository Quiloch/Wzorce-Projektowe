package wp1.z2;

public abstract class ShapeFactory 
{
    public static Figure getShape(ShapeType name) 
    {
        Figure shape = null;
        switch (name) 
        {
            case CIRCLE:
                shape = new Circle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case TRIANGLE:
                shape = new Triangle();
                break;
        }
        return shape;
    }
}