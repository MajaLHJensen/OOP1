package Task2;

public class Room {

    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows)
    {
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }
    public int getDOW()
    {
        return numberOfDoors;
    }
    public int getNOL()
    {
        return numberOfLamps;
    }

    public int getNOW()
    {
        return numberOfWindows;
    }
}
