package domain;

import java.util.List;

public class Rover {
    String[] directions = new String[]{"N", "E", "S", "W"};
    private int directionIndex = 0;
    private int y = 0;
    private int x = 0;

    public Rover() {
    }

    public String direction() {
        return directions[directionIndex];
    }

    public void move(List<Command> commands) {
        if (commands == null) {
            throw new IllegalArgumentException();
        }

        for (Command command : commands) {

            if (command == Command.RIGHT) {
                directionIndex++;
                if (directionIndex == 4) {
                    directionIndex = 0;
                }

            } else if (command == Command.LEFT) {
                directionIndex--;
                if (directionIndex == -1) {
                    directionIndex = 3;
                }

            } else if (command == Command.MOVE) {
                if (direction().equals("W")) {
                    x++;
                } else {
                    y++;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public String position() {
        return x + "," + y;
    }
}
