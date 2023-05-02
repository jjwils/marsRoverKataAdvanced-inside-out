package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class RoverShould {
    private Rover rover;


    @BeforeEach
    void initialize() {
        CommandConverter commandConverter = new CommandConverter();
        rover = new Rover(commandConverter);
    }

    @Test
    void give_direction_N_when_no_commands() {

        assertEquals("N", rover.direction());

    }






}
