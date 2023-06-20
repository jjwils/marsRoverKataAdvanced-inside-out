package adapter.in;

import static org.junit.jupiter.api.Assertions.assertEquals;
import domain.Command;
import org.junit.jupiter.api.Test;

public class CommandConverterShould {

  @Test
  void return_empty_list_for_empty_string() {
    assertEquals(0, CommandConverter.getCommands("").size());
  }

  @Test
  void return_enum_for_a_single_string() {
    assertEquals(1, CommandConverter.getCommands("R").size());
    assertEquals(Command.RIGHT, CommandConverter.getCommands("R").get(0));

  }

  @Test
  void return_enums_for_a_string() {
    assertEquals(2, CommandConverter.getCommands("RL").size());
    assertEquals(Command.RIGHT, CommandConverter.getCommands("RL").get(0));
    assertEquals(Command.LEFT, CommandConverter.getCommands("RL").get(1));
  }
}
