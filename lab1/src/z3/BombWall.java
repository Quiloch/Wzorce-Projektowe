package wp1.z3;


public class BombWall extends Wall 
{
    private boolean isBomb;


    public BombWall(boolean isBomb) 
    {
        this.isBomb = isBomb;
    }

    public BombWall(BombWall other) 
    {
        isBomb = other.isBomb;
    }

    @Override
    public Wall clone() 
    {
        return new BombWall(this);
    }
}