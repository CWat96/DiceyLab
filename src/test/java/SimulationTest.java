import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SimulationTest {

    @Test
    public void testRunSimulation() {
        //Give
        int numberOfDies = 2;
        int numberOfTosses = 1000;
        Simulation simulation = new Simulation(numberOfDies, numberOfTosses);
        //When
        simulation.runSimulation();
        //Then
        assertNotNull(simulation);
    }
}
