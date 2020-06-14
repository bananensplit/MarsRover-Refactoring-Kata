package mars.rover;

public class MarsRover {
    public final int[] plane;

    /**
     * @param plane [x,y]: array with two elements that define the width (x) and height (y) of the plane for the rover
     *              x and y should be positive Integers
     */
    public MarsRover(int[] plane) {
        this.plane = plane;
    }

    public String move(int x, int y, char direction, String instructions) {
        if (!instructions.isEmpty()) {
            int xbuffer = x;
            int ybuffer = y;

            String directions = "NESW";
            int[] movements = {1, 1, -1, -1};

            for (char instruction : instructions.toCharArray()) {
                switch (instruction) {
                    case 'R':
                        direction = directions.charAt((directions.indexOf(direction) + 1) % 4);
                        break;
                    case 'L':
                        direction = directions.charAt((directions.indexOf(direction) + 4 - 1) % 4);
                        break;
                    case 'M':
                        int index = directions.indexOf(direction);
                        if (index % 2 == 0) {
                            y += movements[index];
                        } else {
                            x += movements[index];
                        }
                        break;
                }

                if (!check(x, y)) {
                    return String.format("%d %d %s", xbuffer, ybuffer, direction);
                }
            }
        }
        return String.format("%d %d %s", x, y, direction);
    }

    /**
     * checks if the Rover is on the defined plane
     * @param posx x Position of the Rover
     * @param posy y Position of the Rover
     * @return true if the Rover is on the plane, false if the Rover is not on the plane
     */
    public boolean check(int posx, int posy) {
        return 0 <= posx && posx <= plane[0] && 0 <= posy && posy <= plane[1];
    }
}
