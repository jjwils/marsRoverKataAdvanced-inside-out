package adapter.in.remote;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import domain.Command;
import org.junit.jupiter.api.Test;

public class CommandConverterShould {


  @Test
  void return_empty_list_for_empty_string() {
    CommandConverter commands = new CommandConverter();

    List<Command> commands1 = new ArrayList<>();

    for (int i = 0; i < "".length(); i++) {

      if ("".toCharArray()[i] == 'R') {
        commands1.add(Command.RIGHT);
        continue;
      }

      if ("".toCharArray()[i] == 'L') {
        commands1.add(Command.LEFT);
        continue;
      }

      throw new IllegalArgumentException();

    }


    List<Command> commandsAsEnum = commands1;
    
    assertEquals(0, commandsAsEnum.size());
  }

  @Test
  void return_enum_for_a_single_string() {
    CommandConverter commands = new CommandConverter();

    List<Command> commands1 = new ArrayList<>();

    for (int i = 0; i < "R".length(); i++) {

      if ("R".toCharArray()[i] == 'R') {
        commands1.add(Command.RIGHT);
        continue;
      }

      if ("R".toCharArray()[i] == 'L') {
        commands1.add(Command.LEFT);
        continue;
      }

      throw new IllegalArgumentException();

    }


    List<Command> commandsAsEnum = commands1;

    assertEquals(1, commandsAsEnum.size());
    assertEquals(Command.RIGHT, commandsAsEnum.get(0));

  }

  @Test
  void return_enums_for_a_string() {
    CommandConverter commands = new CommandConverter();

    List<Command> commands1 = new ArrayList<>();

    for (int i = 0; i < "RL".length(); i++) {

      if ("RL".toCharArray()[i] == 'R') {
        commands1.add(Command.RIGHT);
        continue;
      }

      if ("RL".toCharArray()[i] == 'L') {
        commands1.add(Command.LEFT);
        continue;
      }

      throw new IllegalArgumentException();

    }


    List<Command> commandsAsEnum = commands1;

    assertEquals(2, commandsAsEnum.size());
    assertEquals(Command.RIGHT, commandsAsEnum.get(0));
    assertEquals(Command.LEFT, commandsAsEnum.get(1));


  }



}
