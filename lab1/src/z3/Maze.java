package wp1.z3;

import java.util.HashMap;

public class Maze 
{	
    private HashMap<Integer, Room> roomMap;

    public Maze() 
    {
        roomMap = new HashMap<>();
    }

    public void addRoom(Room room) 
    {
        roomMap.put(room.getRoomNo(), room);
    }

    public Room getRoom(int roomNo) 
    {
        return roomMap.get(roomNo);
    }

    @Override
    public Maze clone() 
    {
        return new Maze();
    }
}