package adapter.in;

import domain.Command;
import domain.Rover;

import java.util.List;

public class RoverRemote {
    private final Rover rover;

    public RoverRemote(Rover rover) {

        this.rover = rover;
    }

    public static void moves(Rover rover, String commandsAsString) {
        if (commandsAsString != null) {
            List<Command> commands = rover.getCommands(commandsAsString);
            for (int i = 0; i < commands.size(); i++) {
                rover.move(commands, i);
            }
        } else {
            throw new IllegalArgumentException();
        }

    }

}
