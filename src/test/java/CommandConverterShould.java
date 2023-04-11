import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class CommandConverterShould {


  @Test
  void return_empty_list_for_empty_string() {
    CommandConverter commands = new CommandConverter();
    
    List<Command> commandsAsEnum = commands.stringToEnum("");
    
    assertEquals(0, commandsAsEnum.size());
  }

}
