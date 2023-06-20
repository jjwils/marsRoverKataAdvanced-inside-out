package domain;

import java.util.List;

public class Rover {
    Compass[] directions = new Compass[]{Compass.NORTH,Compass.EAST, Compass.SOUTH, Compass.WEST};
    private int directionIndex = 0;
    private int y = 0;
    private int x = 0;

    public Rover() {
    }

    public Compass direction() {
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
                if (direction().equals(Compass.EAST)) {
                    x++;
                }else if (direction().equals(Compass.WEST)) {
                    x--;
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
