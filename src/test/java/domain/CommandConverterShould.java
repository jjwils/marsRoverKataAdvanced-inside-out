package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import domain.Command;
import domain.CommandConverter;
import org.junit.jupiter.api.Test;

public class CommandConverterShould {


  @Test
  void return_empty_list_for_empty_string() {
    CommandConverter commands = new CommandConverter();
    
    List<Command> commandsAsEnum = commands.stringToEnum("");
    
    assertEquals(0, commandsAsEnum.size());
  }

  @Test
  void return_enum_for_a_single_string() {
    CommandConverter commands = new CommandConverter();

    List<Command> commandsAsEnum = commands.stringToEnum("R");

    assertEquals(1, commandsAsEnum.size());
    assertEquals(Command.RIGHT, commandsAsEnum.get(0));

  }

  @Test
  void return_enums_for_a_string() {
    CommandConverter commands = new CommandConverter();

    List<Command> commandsAsEnum = commands.stringToEnum("RL");

    assertEquals(2, commandsAsEnum.size());
    assertEquals(Command.RIGHT, commandsAsEnum.get(0));
    assertEquals(Command.LEFT, commandsAsEnum.get(1));


  }



}
