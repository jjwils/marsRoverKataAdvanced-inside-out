package domain;

import java.util.List;

public class Rover {
    private final Coordinates coordinates = new Coordinates();
    private final Direction direction = new Direction();
    Compass[] directions = new Compass[]{Compass.NORTH,Compass.EAST, Compass.SOUTH, Compass.WEST};

    public Rover() {
    }

    public Compass direction() {
        return directions[direction.directionIndex];
    }

    public void move(List<Command> commands) {
        if (commands == null) {
            throw new IllegalArgumentException();
        }

        for (Command command : commands) {

            if (command == Command.RIGHT) {
                direction.moveRight();

            } else if (command == Command.LEFT) {
                direction.moveLeft();

            } else if (command == Command.MOVE) {
                if (direction().equals(Compass.EAST)) {
                    coordinates.moveEast();
                }else if (direction().equals(Compass.WEST)) {
                    coordinates.moveWest();
                } else {
                    coordinates.moveNorth();
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public String position() {
        return coordinates.position();
    }

}
