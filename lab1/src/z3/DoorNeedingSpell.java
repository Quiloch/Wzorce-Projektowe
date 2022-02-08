package wp1.z3;

public class DoorNeedingSpell extends Door 
{
    public DoorNeedingSpell(Room room1, Room room2) 
    {
        super(room1, room2);
    }

    public DoorNeedingSpell(DoorNeedingSpell other) 
    {
        super(other);
    }

    @Override
    public Door clone() 
    {
        return new DoorNeedingSpell(this);
    }
}