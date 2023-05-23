package domain;

import java.util.ArrayList;
import java.util.List;

public class CommandConverter {

  public List<Command> getCommands(String commandsAsString) {

    List<Command> commands = new ArrayList<>();

    for (int i = 0; i < commandsAsString.length(); i++) {

      if (commandsAsString.toCharArray()[i] == 'R') {
        commands.add(Command.RIGHT);
        continue;
      }

      if (commandsAsString.toCharArray()[i] == 'L') {
        commands.add(Command.LEFT);
        continue;
      }

      throw new IllegalArgumentException();

    }

    return commands;


  }
}
