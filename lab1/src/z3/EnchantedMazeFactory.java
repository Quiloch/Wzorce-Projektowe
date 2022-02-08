package wp1.z3;

public class EnchantedMazeFactory extends MazeFactory 
{	
    public EnchantedMazeFactory() {}

    public Maze makeMaze() 
    {
        return new Maze();
    }

    public Wall makeWall() 
    {
        return new Wall();
    }

    public Room makeRoom(int roomNo) 
    {
        return new EnchantedRoom(roomNo, new Spell() 
        {			
            @Override
            public void castSpell() {}
        });
    }

    public Door makeDoor(Room room1, Room room2) 
    {
        return new DoorNeedingSpell(room1, room2);
    }
}