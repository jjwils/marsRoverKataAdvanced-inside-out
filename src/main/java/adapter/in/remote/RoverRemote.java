package adapter.in.remote;

import domain.Command;
import domain.Rover;

import java.util.List;

public class RoverRemote {

    private Rover rover;

    public RoverRemote(Rover rover) {
        this.rover = rover;
    }

    public void moves(String commandsAsString) {
        if (commandsAsString != null) {
            List<Command> commands = CommandConverter.getCommands(commandsAsString);
            rover.move(commands);
        } else {
            throw new IllegalArgumentException();
        }

    }

}
