package domain;

import java.util.List;

public class Rover {
    String[] directions = new String[]{"N", "E", "S", "W"};
    private int directionIndex = 0;

    public Rover() {
    }

    public String direction() {
        return directions[directionIndex];
    }

    public void move(List<Command> commands) {
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

            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}
