public class Simulation {
    int numberOfDies;
    int numberOfTosses;
    Bins bins;

    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }

    public void runSimulation() {
        Dice dice = new Dice(this.numberOfDies);
        Bins bins = new Bins(this.numberOfDies * 6);

        for (int i = 0; i < this.numberOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
        printResults();
    }

    public void printResults() {
        int binNumber;
        int lengthOfBin = numberOfDies * 6 - numberOfDies + 1;
        System.out.println(String.format("***\nSimulation of %d dice tossed for %d times.\n***\n", numberOfDies, numberOfTosses));

        for (int i = numberOfDies; i <= numberOfDies * 6; i++) {
            int totalRolls = bins.getBin(i);
            float frequency = (float) totalRolls / numberOfTosses;
            String asterisk = "*".repeat((int) (frequency * 100));
            System.out.printf("%2d : %,9d: %.2f %s\n", i, totalRolls, frequency, asterisk);

        }
    }
}