import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TrackingBinsTest {

    @Test
    public void testIncrementBin() {
        //Given
        Bins bins = new Bins(2);
        //When
        bins.incrementBin(3);
        //Then
        int[] expectedDiceArr = new int[2 * 6];
        expectedDiceArr[3] = 1;
        assertArrayEquals(expectedDiceArr, bins.diceArr);
    }

    @Test
    public void testInvalidBinNumber() {
        //Given
        Bins bins = new Bins(2);
        //When
        bins.incrementBin(-1);
        //Then
        int[] expectedDiceArr = new int[2 * 6];
        assertArrayEquals(expectedDiceArr, bins.diceArr);
    }

    @Test
    public void testInvalidBinNumberOutOfRange() {
        //Given
        Bins bins = new Bins(2);
        //When
        bins.incrementBin(20);
        //Then
        int[] expectedDiceArr = new int[2 * 6];
        assertArrayEquals(expectedDiceArr, bins.diceArr);
    }

}
