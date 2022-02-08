package wp1.z3;

public class MazeGame
{
    public static void main(String[] args) 
    {
        MazeGame game = new MazeGame();
        Maze maze = null;

        EnchantedMazeFactory enchantedMazeFactory = new EnchantedMazeFactory();
        maze = game.createMaze(enchantedMazeFactory);

        System.out.println(maze.toString());
    }

    public Maze createMaze(MazeFactory factory) 
    {
        Maze maze = factory.makeMaze();
        Room room1 = factory.makeRoom(1);
        Room room2 = factory.makeRoom(2);
        Door theDoor = factory.makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Room.Direction.north, new Wall());
        room1.setSide(Room.Direction.east, theDoor);
        room1.setSide(Room.Direction.south, new Wall());
        room1.setSide(Room.Direction.west, new Wall());

        room2.setSide(Room.Direction.north, new Wall());
        room2.setSide(Room.Direction.east, new Wall());
        room2.setSide(Room.Direction.south, new Wall());
        room2.setSide(Room.Direction.west, theDoor);

        return maze;
    }
}