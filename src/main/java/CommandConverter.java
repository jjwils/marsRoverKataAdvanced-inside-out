import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandConverter {

  public List<Command> stringToEnum(String commandsString) {

    List<Command> commands = new ArrayList<>();

    for (int i = 0; i < commandsString.length(); i++) {

      if (commandsString.toCharArray()[i] == 'R') {
        commands.add(Command.RIGHT);
        continue;
      }

      if (commandsString.toCharArray()[i] == 'L') {
        commands.add(Command.LEFT);
        continue;
      }

      throw new IllegalArgumentException();

    }

    return commands;



  }
}
