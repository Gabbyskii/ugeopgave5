package task1;

public class Main {
    void main(){
        //bygning
        Building building1 = new Building("House");

        // 3 rum
        Room bedroom1 = new Room("bedroom");
        Room livingRoom1 = new Room("living room");
        Room office1= new Room("office");

        // tilføjer rum til bygnignen
        building1.addRoom(bedroom1);
        building1.addRoom(livingRoom1);
        building1.addRoom(office1);


        // 2 lamper + 1 vindue tilføjet til hvert rum:
        Lamp chandelier1 = new Lamp(25, true);
        Lamp nightLamp1 = new Lamp(7,false);
        Window window1 = new Window(7,10);

        bedroom1.addLamp(chandelier1);
        bedroom1.addLamp(nightLamp1);
        bedroom1.addWindow(window1);

        //2
        Lamp chandelier2 = new Lamp(10, true);
        Lamp nightLamp2 = new Lamp(5,false);
        Window window2 = new Window(7,10);

        livingRoom1.addLamp(chandelier2);
        livingRoom1.addLamp(nightLamp2);
        livingRoom1.addWindow(window2);

        //3
        Lamp chandelier3 = new Lamp(10, true);
        Lamp nightLamp3 = new Lamp(20,false);
        Window window3 = new Window(7,10);

        office1.addLamp(chandelier3);
        office1.addLamp(nightLamp3);
        office1.addWindow(window3);

        //print hele bygningen
        building1.printBuilding();

        int watts = building1.getTotalWatt();
        int lamps = building1.getTotalLampCount();
        System.out.println("Total in building: "+ lamps + " lamps, "+ watts +"W");




    }


}
