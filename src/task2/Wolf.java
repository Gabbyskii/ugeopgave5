package task2;

import java.util.Random;

public class Wolf extends Animal {

    private Random r = new Random();

    public Wolf(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        return r.nextInt(20+1);
    }

    @Override
    public String toString() {
        return "Wolf: " + getName() + ", (Energi: " + getEnergy() + ")";
    }

}
