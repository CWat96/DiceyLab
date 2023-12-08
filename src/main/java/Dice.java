import java.util.Random;

public class Dice {

    public int numOfDies;

    public Dice(int numOfDies) {
        this.numOfDies = numOfDies;
    }

    public int Roll() {
        int min = 1; // represent the faces of a die
        int max = 6;  // represent the faces of a die
        Random random = new Random();
        int randomRoll = random.nextInt((max - min) + 1) + min;

        return randomRoll;
    }

    public int TossAndSum() { //track number of rolls
        int sum = 0;
        for (int i = 0; i < this.numOfDies; i++) { // generates random # and # of times for the loop
            sum += Roll();
        }
        return sum;
    }

    public int tossAndSum() {
        return 0;
    }
}
