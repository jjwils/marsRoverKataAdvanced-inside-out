import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        rover.move("R");
        assertEquals("E", rover.direction());

    }

    @Test
    void should_give_direction_W_when_command_left() {
        rover.move("L");
        assertEquals("W", rover.direction());

    }

    @Test
    void should_give_direction_N_when_command_four_right() {
        rover.move("R");
        rover.move("R");
        rover.move("R");
        rover.move("R");
        assertEquals("N", rover.direction());

    }

    // MMRMMLM
    @Test
    void should_give_direction_N_when_command_right_left() {

        rover.move("R");
        rover.move("L");

        assertEquals("N", rover.direction());

    }
}
