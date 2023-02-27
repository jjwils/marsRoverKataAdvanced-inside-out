import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovementTest {

    @Test
    void should_give_direction_N_when_no_commands() {

        Rover rover = new Rover();
        assertEquals("N", rover.direction());

    }

    @Test
    void should_give_direction_E_when_command_right() {

        Rover rover = new Rover();
        rover.move("R");
        assertEquals("E", rover.direction());

    }

    @Test
    void should_give_direction_W_when_command_left() {

        Rover rover = new Rover();
        rover.move("L");
        assertEquals("W", rover.direction());

    }

    @Test
    void should_give_direction_N_when_command_four_right() {

        Rover rover = new Rover();
        rover.move("R");
        rover.move("R");
        rover.move("R");
        rover.move("R");
        assertEquals("N", rover.direction());

    }
    // MMRMMLM
    @Test
    void should_give_direction_N_when_command_right_left() {

        Rover rover = new Rover();
        rover.move("R");
        rover.move("L");

        assertEquals("N", rover.direction());

    }
}
