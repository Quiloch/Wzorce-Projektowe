package wp1;

public class Singleton 
{
    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() 
    {
        return INSTANCE;
    }
    
    public void printSingleton()
    {
        System.out.println("Singleton");
    }
}