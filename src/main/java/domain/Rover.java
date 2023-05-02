package domain;

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

    public List<Command> getCommands(String commandsAsString) {
        return commandConverter.stringToEnum(commandsAsString);
    }



    public void loopMoves(List<Command> commands) {
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
