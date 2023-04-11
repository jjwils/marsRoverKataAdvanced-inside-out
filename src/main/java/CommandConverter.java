import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandConverter {

  public List<Command> stringToEnum(String commandsString) {

    List<Command> commands = Collections.emptyList();

    if (commandsString.equals("R")) {
      commands = List.of(Command.RIGHT);
    }

    return commands;



  }
}
