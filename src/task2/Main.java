package task2;

import java.util.ArrayList;

public class Main {
    void main(){
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Simba", 80));
        animals.add(new Wolf("Jason", 100));
        animals.add(new Rabbit("Peter"));
        animals.add(new Lion("Scar", 90));

        // Konkurrér i par: [0 vs 1], [2 vs 3] - forstod ikke helt anvendelsen af for loop her...
        for (int i = 0; i+1 < animals.size(); i += 2) {
            Animal a = animals.get(i);
            Animal b = animals.get(i + 1);
            System.out.println("\n=== " + a.getName() + " vs " + b.getName() + " ===");

            Contest contest = new Contest(a, b);
            while (contest.getWinner() == null) {
                contest.playRound();
            }

            System.out.println("\nWinner: " + contest.getWinner().getName()+ "!!!!");
        }

    }

}
