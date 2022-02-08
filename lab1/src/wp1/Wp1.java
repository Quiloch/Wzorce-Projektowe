package wp1;

public class Wp1 
{
    public static void main(String[] args) 
    {
        Singleton.getInstance().printSingleton();
        System.out.println("Tekst 1" + "\n" + "Tekst 2" + "\n" + "Tekst 3");
        System.out.println();
        
        Singleton2 singleton = Singleton2.getInstance("Jeden");
        Singleton2 singleton2 = Singleton2.getInstance("Dwa");
        System.out.println(singleton.value);
        System.out.println(singleton2.value);
    }   
    
    
}