package Task2;

import java.util.ArrayList;

public class Building {
    final private ArrayList<Room> Rooms;
    int numberOfBathrooms;
    int numberOfFloors;
    boolean isOfficeBuilding;


    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        Room rom1 = new Room(2, 4, 2);
        Room rom2 = new Room(4, 6, 1);
        Room rom3 = new Room(3, 8, 4);

        ArrayList<Room> Rooms = new ArrayList<>();
        Rooms.add(rom1);
        Rooms.add(rom2);
        Rooms.add(rom3);

        this.Rooms = Rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getR() {
        return Rooms;
    }

    public int getNOB() {
        return numberOfBathrooms;
    }

    public int getNOF() {
        return numberOfFloors;
    }

    public boolean getIOB() {
        return isOfficeBuilding;
    }

    public static void main(String[] args) {
        Building building = new Building(3, 4, true);
        System.out.println(CountLampsInBuilding(building));
        System.out.println(isNormal(building));
    }

    public static int CountLampsInBuilding(Building building) {
        ArrayList<Room> rooms = building.getR();
        int total = 0;
        for (Room room : rooms) {
            int numberOfLamps = room.getNOL();
            total += numberOfLamps;
        }
        return total;
    }

    public static boolean isNormal(Building building) {
        int numberOfRoom = building.getR().size();
        int numberOfFloors = building.getNOF();

        if (numberOfFloors > numberOfRoom) {
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }

    }

}
