package wp1.z2;

public class Application 
{
    public static void main(String[] args) 
    {
        Figure circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        if (circle != null) 
        {
            circle.draw();
        } 
        else 
        {
            System.out.println("Nie mozna narysowac figury.");
        }
        
        Figure triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
        if (triangle != null) 
        {
            triangle.draw();
        } 
        else 
        {
            System.out.println("Nie mozna narysowac figury");
        }
        
        Figure square = ShapeFactory.getShape(ShapeType.SQUARE);
        if (square != null) 
        {
            square.draw();
        } 
        else 
        {
            System.out.println("Nie mozna narysowac figury");
        }
        
        Figure rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);
        if (rectangle != null) 
        {
            rectangle.draw();
        } 
        else 
        {
            System.out.println("Nie mozna narysowac figury.");
        }
    }
}
