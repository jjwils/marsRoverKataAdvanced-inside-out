package domain;

public class Coordinates {
    int y = 0;
    int x = 0;

    public Coordinates() {
    }

    int moveEast() {
        return x++;
    }

    int moveWest() {
        return x--;
    }

    int moveNorth() {
        return y++;
    }

    String position() {
        return x + "," + y;
    }
}