package wp1;

public final class Singleton2 
{
    private static Singleton2 instance;
    public String value;

    private Singleton2(String value) 
    {
        try 
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex){}
        this.value = value;
    }

    public static Singleton2 getInstance(String value)     
    {
        if (instance == null) 
        {
            instance = new Singleton2(value);
        }
        return instance;
    }
}