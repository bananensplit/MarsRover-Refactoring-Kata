package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void acceptance_test_1() {
        String newPosition = MarsRover.move(1, 2, 'N', "LMLMLMLMM");
        assertEquals("1 3 N", newPosition);
    }

    @Test
    public void acceptance_test_2() {
        String newPosition = MarsRover.move(3, 3, 'E', "MMRMMRMRRM");
        assertEquals("5 1 E", newPosition);
    }

    @Test
    public void acceptance_test_3() {
        String newPosition = MarsRover.move(0, 0, 'S', "M");
        assertEquals("0 0 S", newPosition);
    }

    @Test
    public void acceptance_test_4() {
        String newPosition = MarsRover.move(0, 0, 'W', "M");
        assertEquals("0 0 W", newPosition);
    }

    @Test
    public void acceptance_test_5() {
        String newPosition = MarsRover.move(3, 3, 'W', "MMMM");
        assertEquals("0 3 W", newPosition);
    }

    @Test
    public void acceptance_test_6() {
        MarsRover rover1 = new MarsRover();
        MarsRover rover2 = new MarsRover();

        String newPosition1 = rover1.move(1, 2, 'N', "LMLMLMLMM");
        String newPosition2 = rover2.move(3, 3, 'E', "MMRMMRMRRM");

        assertEquals("1 3 N", newPosition1);
        assertEquals("5 1 E", newPosition2);
    }

}