package mars.rover;

public class MarsRover {

    public static String move(int x, int y, char direction, String instructions) {
        if (!instructions.isEmpty()) {
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
            }
        }
        return String.format("%d %d %s", x, y, direction);
    }
}
