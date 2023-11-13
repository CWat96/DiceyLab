import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testDiceConstructor() {
        // Given
        int numOfDie = 2;
        // When
        Dice dice = new Dice(numOfDie);
        // Then
        Assert.assertEquals(numOfDie, dice.numOfDies);
    }

    @Test
    public void Roll() {
        // Given
        Dice dice = new Dice(1);
        // When
        int result = dice.Roll();
        // Then
        Assert.assertTrue(result >=1 && result <=6);
    }

    @Test
    public  void diceSum() {
        // Given
        Dice dice = new Dice(2);
        // When
        int result = dice.TossAndSum();
        // Then
        Assert.assertTrue(result >= 2 && result <=12);
    }

    @Test
    public  void name() {

    }
}
