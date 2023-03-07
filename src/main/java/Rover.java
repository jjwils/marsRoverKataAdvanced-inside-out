public class Rover {
    String[] directions = new String[]{"N", "E", "S", "W"};
    private int directionIndex = 0;

    public String direction() {
        return directions[directionIndex];
    }

    public void move(String command) {
        if (command != null) {

            if (command.equals("R")) {
                directionIndex++;
                if (directionIndex == 4) {
                    directionIndex = 0;
                }
                return;
            } else if (command.equals("L")) {
                directionIndex--;
                if (directionIndex == -1) {
                    directionIndex = 3;
                }
                return;
            }



        }
        throw new IllegalArgumentException();
    }
}
