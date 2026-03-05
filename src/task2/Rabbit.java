package task2;

public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(name, 120);
    }

    @Override
    public int attack() {
        return 5;
    }

    @Override
    public String toString() {
        return "Rabbit: " + getName() + " (Energi: " + getEnergy() + ")";
    }
}
