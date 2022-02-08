package wp1.z3;

public class Room
{
    public static enum Direction {north, east, south, west};	
    private MapSite[] mMapSites;	
    private int mRoomNumber;	
    public Room() {}
	
    public Room(Room other) 
    {
        mRoomNumber = other.mRoomNumber;
        mMapSites = new MapSite[Direction.values().length];
    }

    public Room(int roomNumber) 
    {
        mRoomNumber = roomNumber;
        mMapSites = new MapSite[Direction.values().length];
    }

    public void init(int roomNumber) 
    {
        mRoomNumber = roomNumber;
    }

    public MapSite getSide(Direction direction) 
    {
        return mMapSites[direction.ordinal()];
    }

    public void setSide(Direction direction, MapSite mapSite) 
    {
        mMapSites[direction.ordinal()] = mapSite;
    }

    public void enter() {}

    @Override
    public Room clone() 
    {
        return new Room(this);
    }

    public int getRoomNo() 
    {
        return mRoomNumber;
    }        
}