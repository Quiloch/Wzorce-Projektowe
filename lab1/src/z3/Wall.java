package wp1.z3;

public class Wall extends MapSite 
{
    public Wall() {}

    public Wall(Wall other) {}

    @Override
    public void enter() {}

    @Override
    public Wall clone() 
    {
        return new Wall(this);
    }
}