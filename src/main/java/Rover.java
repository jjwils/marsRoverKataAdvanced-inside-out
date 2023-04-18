import java.util.ArrayList;
import java.util.List;

public class Rover {
    String[] directions = new String[]{"N", "E", "S", "W"};
    private int directionIndex = 0;

     CommandConverter commandConverter;

    public Rover(CommandConverter commandConverter) {
        this.commandConverter = commandConverter;
    }

    public String direction() {
        return directions[directionIndex];
    }


    public void moves(String commandsAsString) {
        if (commandsAsString != null) {
            List<Command> commands = commandConverter.stringToEnum(commandsAsString);
            for (int i = 0; i < commands.size(); i++) {
                move(commands, i);
            }
        } else {
            throw new IllegalArgumentException();
        }

    }

    private void move(List<Command> commands, int i) {
        if (commands.get(i) == Command.RIGHT) {
            directionIndex++;
            if (directionIndex == 4) {
                directionIndex = 0;
            }

        } else if (commands.get(i) == Command.LEFT) {
            directionIndex--;
            if (directionIndex == -1) {
                directionIndex = 3;
            }

        } else {
            throw new IllegalArgumentException();
        }
    }
}
