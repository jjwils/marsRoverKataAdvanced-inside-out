public class Rover {
    String[] directions = new String[]{"N", "E", "S", "W"};
    private int directionIndex = 0;

    public String direction() {
        return directions[directionIndex];
    }


    public void moves(String command) {
        if (command != null) {
            char[] commands = command.toCharArray();
            for (int i = 0; i < commands.length; i++) {
                move(commands, i);
            }
        } else {
            throw new IllegalArgumentException();
        }

    }

    private void move(char[] commands, int i) {
        if (commands[i] == 'R') {
            directionIndex++;
            if (directionIndex == 4) {
                directionIndex = 0;
            }

        } else if (commands[i] == 'L') {
            directionIndex--;
            if (directionIndex == -1) {
                directionIndex = 3;
            }

        } else {
            throw new IllegalArgumentException();
        }
    }
}
