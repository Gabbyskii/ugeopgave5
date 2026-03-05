package task2;

public class Contest {

    Animal animal1;
    Animal animal2;
    private int rounds;

    public int getRounds() {
        return rounds+= 1;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }


    public Contest(Animal animal1, Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public void playRound() {
        System.out.println("\n--- Round: " + getRounds() + " ---");

        int damage1 = animal1.attack();
        animal2.setEnergy(animal2.getEnergy() - damage1);
        System.out.println(animal1.getName() + " attacks " + animal2.getName()
                + " for " + damage1 + "! (" + animal2.getName()
                + " has " + animal2.getEnergy() + " energy left)");

        if (animal2.isActive()) {
            int damage2 = animal2.attack();
            animal1.setEnergy(animal1.getEnergy() - damage2);
            System.out.println(animal2.getName() + " attacks " + animal1.getName()
                    + " for " + damage2 + "! (" + animal1.getName()
                    + " has " + animal1.getEnergy() + " energy left)");
        }
    }

    public Animal getWinner() {
        if (!animal1.isActive()){
            return animal2;
        }
        else if (!animal2.isActive()) {
            return animal1;
        }
        return null;
    }




}
