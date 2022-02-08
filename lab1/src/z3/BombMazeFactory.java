package wp1.z3;

public class BombMazeFactory extends MazeFactory 
{	
    public BombMazeFactory() {}

    public Maze makeMaze() 
    {
        return new Maze();
    }

    public Wall makeWall() 
    {
        return new BombWall(true);
    }

    public Room makeRoom(int roomNumber) 
    {
        return new RoomWithABomb(roomNumber);
    }

    public Door makeDoor(Room fromRoom, Room toRoom) 
    {
        return new Door(fromRoom, toRoom);
    }
}