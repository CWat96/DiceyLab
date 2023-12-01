import java.util.Arrays;

public class Bins {
    // is a tracking class, it's used to track the dice rolled
    int[] diceArr; // integer array and undeclared variableName 'diceArr'

    public Bins(int numOfDice) { // pulled bins from superclass and made the param numOfDice
        this.diceArr = new int[numOfDice * 6];
    }

    public void incrementBin(int binNumber) {
        if (binNumber >= 0 && binNumber < diceArr.length) {
            diceArr[binNumber]++;
        } else {
            System.out.println("Invalid binNumber: " + binNumber);
        }
    }

    public static void main(String[] args) {
        Bins bins = new Bins(2);
        bins.incrementBin(3);
        System.out.println(Arrays.toString(bins.diceArr));

    }
}
