package task1;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Lamp>lamps;
    private ArrayList<Window>windows;

    public Room(String name) {
        this.name = name;
        this.lamps = new ArrayList<>();
        this.windows = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLamp(Lamp lamp){
        lamps.add(lamp);
    }

    public void addWindow(Window window){
        windows.add(window);
    }

    public int getLampCount(){
        return lamps.size();
    }


    public int getTotalWatt(){
       int total = 0;

       for (Lamp lamp: lamps){
           total += lamp.getWatt();
       }
        return total;
    }

    public int getTotalWindowArea(){
        int totalWA = 0;

        for (Window window: windows){
            totalWA += window.getAreaCm2();
        }
        return totalWA;
    }

    public void printRoom(){
        System.out.println("\nRoom -- " + getName() + " ("+ lamps.size() + " lamps, "
                + windows.size() + " windows)");
        System.out.println("Lamps: Total watts = " + getTotalWatt() + "W");

        System.out.println("Windows: Total area = " + getTotalWindowArea() + "cm2");
        for (Window window: windows) {
            System.out.println(window);
        }

    }


}
