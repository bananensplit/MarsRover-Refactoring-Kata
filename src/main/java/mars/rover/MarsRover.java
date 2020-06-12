package mars.rover;

public class MarsRover {
    public final int[] plane;

    public MarsRover(int[] plane) {
        this.plane = plane;
    }

    public String move(int x, int y, char direction, String instructions) {
        if (!instructions.isEmpty()) {
            char instruction = instructions.charAt(0);
            if (instruction == 'L') {
                if (direction == 'N') {
                    return move(x, y, 'W', instructions.substring(1, instructions.length()));
                } else if (direction == 'W') {
                    return move(x, y, 'S', instructions.substring(1, instructions.length()));
                } else if (direction == 'S') {
                    return move(x, y, 'E', instructions.substring(1, instructions.length()));
                } else if (direction == 'E') {
                    return move(x, y, 'N', instructions.substring(1, instructions.length()));
                }
            } else if (instruction == 'R') {
                if (direction == 'N') {
                    return move(x, y, 'E', instructions.substring(1, instructions.length()));
                } else if (direction == 'W') {
                    return move(x, y, 'N', instructions.substring(1, instructions.length()));
                } else if (direction == 'S') {
                    return move(x, y, 'W', instructions.substring(1, instructions.length()));
                } else if (direction == 'E') {
                    return move(x, y, 'S', instructions.substring(1, instructions.length()));
                }
            } else if (instruction == 'M') {
                if (direction == 'N') {
                    return move(x, y + 1, 'N', instructions.substring(1, instructions.length()));
                } else if (direction == 'S') {
                    return move(x, y - 1, 'S', instructions.substring(1, instructions.length()));
                } else if (direction == 'W') {
                    return move(x - 1, y, 'W', instructions.substring(1, instructions.length()));
                } else if (direction == 'E') {
                    return move(x + 1, y, 'E', instructions.substring(1, instructions.length()));
                }
            }
        }
        return x + " " + y + " " + direction;
    }

    public boolean check(int posx, int posy) {
        return 0 <= posx && posx <= plane[0] && 0 <= posy && posy <= plane[1];
    }
}
