import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovementTest {
    private Rover rover;

    @BeforeEach
    void initialize() {
        rover = new Rover();
    }

    @Test
    void should_give_direction_N_when_no_commands() {

        assertEquals("N", rover.direction());

    }

    // MMRMMLM
    @ParameterizedTest
    @CsvSource( {"RL,N", "RRRR,N", "R,E", "L,W"  })
    void should_give_direction_when_command(String command,String direction) {

        rover.moves(command);

        assertEquals(direction, rover.direction());
    }

    @Test
    void should_give_error_when_command_isNull() {
        assertThrows(IllegalArgumentException.class, () -> rover.moves(null) , "Command is null" );
    }

    @Test
    void should_give_error_when_command_is_not_allowed() {
        assertThrows(IllegalArgumentException.class, () -> rover.moves("Z") , "Command is invalid" );
    }

    @Test
    @Disabled
    // TODO: Enable test, decide on a name
    void should_give_cant_decide() {
        List<Command> commandsAsEnum = rover.commandsStringToEnum("RL");
        assertEquals(2, commandsAsEnum.size());
    }


}
