package adapter.in;

import domain.Command;
import domain.Rover;

import java.util.List;

public class RoverRemote {
    private final Rover rover;
    CommandConverter commandConverter = new CommandConverter();

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


    public String direction() {
        return rover.direction().toString().substring(0,1);

    }
}
