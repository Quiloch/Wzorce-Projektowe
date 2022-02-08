package wp1.z3;

public class Door extends MapSite
{
    private Room mRoom1;
    private Room mRoom2;
    private boolean isOpen;

    public Door() {}

    public Door(Door other) 
    {
        mRoom1 = other.mRoom1;
        mRoom2 = other.mRoom2;

        isOpen = other.isOpen;
    }

    public Door(Room room1, Room room2)
    {
        mRoom1 = room1;
        mRoom2 = room2;
    }

    public void init(Room room1, Room room2) 
    {
        mRoom1 = room1;
        mRoom2 = room2;
    }

    public void enter() {}

    public Room otherSideFrom(Room room) 
    {
        if(room.equals(mRoom1)) 
        {
            return mRoom2;
        } 
        else 
        {
            return mRoom1;
        }
    }

    @Override
    public Door clone() 
    {
        return new Door(this);
    }
}