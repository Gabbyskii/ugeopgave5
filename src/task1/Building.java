package task1;

import java.util.ArrayList;

public class Building {

    private String name;
    private ArrayList<Room>rooms;

    public Building(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public int getTotalLampCount(){
        int total = 0;

        for (Room room: rooms){
            total += room.getLampCount();
        }
        return total;
    }

    public int getTotalWatt() {
        int total = 0;
        for (Room room : rooms) {
            total += room.getTotalWatt();
        }
        return total;
    }

    public void printBuilding() {
        System.out.println("===Building: " + getName()+"===");
        for (Room room: rooms) {
            room.printRoom();
        }
    }


}
