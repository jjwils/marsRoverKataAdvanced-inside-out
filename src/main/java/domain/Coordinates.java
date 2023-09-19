package domain;

public class Coordinates {
    int y = 0;
    int x = 0;

    public Coordinates() {
    }

    void moveEast() {
        x++;
    }

    void moveWest() {
        x--;
    }

    void moveNorth() {
        y++;
    }

    String position() {
        return x + "," + y;
    }
}