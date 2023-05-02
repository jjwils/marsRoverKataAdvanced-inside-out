package adapter.in;

import domain.Command;
import domain.Rover;

import java.util.List;

public class RoverRemote {
    private final Rover rover;

    public RoverRemote(Rover rover) {
        this.rover = rover;
    }

    public void moves(String commandsAsString) {
        if (commandsAsString != null) {
            List<Command> commands = rover.getCommands(commandsAsString);
            rover.loopMoves(commands);
        } else {
            throw new IllegalArgumentException();
        }

    }

}
