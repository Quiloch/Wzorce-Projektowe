package wp1.z3;

public class RoomWithABomb extends Room 
{
    public RoomWithABomb(int roomNumber) 
    {
        super(roomNumber);
    }

    public RoomWithABomb(RoomWithABomb other) 
    {
        super(other);
    }

    @Override
    public Room clone() 
    {
        return new RoomWithABomb(this);
    }
}