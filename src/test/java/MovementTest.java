import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
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

    @Test
    void should_give_direction_E_when_command_right() {

        rover.moves("R");
        assertEquals("E", rover.direction());

    }

    @Test
    void should_give_direction_W_when_command_left() {
        rover.moves("L");
        assertEquals("W", rover.direction());

    }

    @Test
    void should_give_direction_N_when_command_four_right() {
        rover.moves("R");
        rover.moves("R");
        rover.moves("R");
        rover.moves("R");
        assertEquals("N", rover.direction());

    }

    // MMRMMLM
    @Test
    void should_give_direction_N_when_command_right_left() {

        rover.moves("R");
        rover.moves("L");

        assertEquals("N", rover.direction());
    }
    @ParameterizedTest
    @ValueSource(strings = {"RL"})
    void should_give_direction_when_command(String directions) {

        rover.moves(directions);

        assertEquals("N", rover.direction());
    }

    @Test
    void should_give_error_when_command_isNull() {
        assertThrows(IllegalArgumentException.class, () -> rover.moves(null) , "Command is null" );
    }

    @Test
    void should_give_error_when_command_is_not_allowed() {
        assertThrows(IllegalArgumentException.class, () -> rover.moves("Z") , "Command is invalid" );
    }


}
