import java.util.ArrayList;
import java.util.List;

public class Rover {
    String[] directions = new String[]{"N", "E", "S", "W"};
    private int directionIndex = 0;

    public String direction() {
        return directions[directionIndex];
    }


    public void moves(String commandsAsString) {
        if (commandsAsString != null) { // TODO revisit
            char[] commands = commandsAsString.toCharArray();
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

    public List<Command> commandsStringToEnum(String commandsAsString) {
        return List.of();
    }
}
