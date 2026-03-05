package task2;

public class Lion extends Animal {
    private String name;
    private int energy;


    public Lion(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        int amount = 15;
        return amount;
    }

    @Override
    public String toString() {
        return "Lion: " + getName() + " (Energi: " + getEnergy() + ")";
    }
}


