package task1;

public class Lamp {
    private int watt;
    private boolean isOn;


    public Lamp(int watt, boolean isOn) {
        this.watt = watt;
        this.isOn = false;
    }

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }


    public void turnOn(){
        if (!isOn){
            System.out.println("Light turned on");
        }

    }


    public void turnOff(){
        if (isOn){
            System.out.println("Light turned off");
        }
    }

    @Override
    public String toString() {
        return watt + ", Ligth on? "  + isOn;
    }

}
