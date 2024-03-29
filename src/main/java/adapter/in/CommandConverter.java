package adapter.in;

import domain.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandConverter {

  public static List<Command> getCommands(String commandsAsString) {

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
      if (commandsAsString.toCharArray()[i] == 'M') {
        commands.add(Command.MOVE);
        continue;
      }

      throw new IllegalArgumentException();

    }

    return commands;


  }
}
