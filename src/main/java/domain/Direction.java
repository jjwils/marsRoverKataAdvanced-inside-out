package domain;

public class Direction {
    int directionIndex = 0;

    public Direction() {
    }

    void moveRight() {
        directionIndex++;
        if (directionIndex == 4) {
            directionIndex = 0;
        }
    }

    void moveLeft() {
        directionIndex--;
        if (directionIndex == -1) {
            directionIndex = 3;
        }
    }
}