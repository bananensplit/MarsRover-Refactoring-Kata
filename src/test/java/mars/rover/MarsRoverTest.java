package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void
    acceptance_test_1() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(1, 2, 'N', "LMLMLMLMM");
        assertEquals("1 3 N", newPosition);
    }

    @Test
    public void
    acceptance_test_2() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(3, 3, 'E', "MMRMMRMRRM");
        assertEquals("5 1 E", newPosition);
    }

    @Test
    public void acceptance_test_3() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(0, 0, 'S', "M");
        assertEquals("0 0 S", newPosition);
    }

    @Test
    public void acceptance_test_4() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(0, 0, 'W', "M");
        assertEquals("0 0 W", newPosition);
    }

    @Test
    public void acceptance_test_5() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(3, 3, 'W', "MMMMLLMM");
        assertEquals("2 3 E", newPosition);
    }

    @Test
    public void acceptance_test_6() {
        MarsRover rover1 = new MarsRover(new int[]{10, 10});
        MarsRover rover2 = new MarsRover(new int[]{10, 10});

        String newPosition1 = rover1.move(1, 2, 'N', "LMLMLMLMM");
        String newPosition2 = rover2.move(3, 3, 'E', "MMRMMRMRRM");

        assertEquals("1 3 N", newPosition1);
        assertEquals("5 1 E", newPosition2);
    }

    @Test
    public void acceptance_test_7() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(3, 3, 'D', "MMMM");
        assertEquals("3 3 D", newPosition);
    }

    @Test
    public void acceptance_test_8() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(3, 3, 'N', "");
        assertEquals("3 3 N", newPosition);
    }

    @Test
    public void acceptance_test_9() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(3, 3, 'N', "S");
        assertEquals("3 3 N", newPosition);
    }

    @Test
    public void acceptance_test_10() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(1, 3, ' ', "M");
        assertEquals("1 3  ", newPosition);
    }

    @Test
    public void acceptance_test_11() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(-1, 3, 'E', "M");
        assertEquals("-1 3 E", newPosition);
    }

    @Test
    public void acceptance_test_12() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(1, -3, 'E', "M");
        assertEquals("1 -3 E", newPosition);
    }

    @Test
    public void acceptance_test_13() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(10, 10, 'E', "M");
        assertEquals("10 10 E", newPosition);
    }

    @Test
    public void acceptance_test_14() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(10, 10, 'N', "M");
        assertEquals("10 10 N", newPosition);
    }

    @Test
    public void acceptance_test_15() {
        String newPosition = new MarsRover(new int[]{10, 10}).move(9, 10, 'E', "MMLLMM");
        assertEquals("8 10 W", newPosition);
    }

}