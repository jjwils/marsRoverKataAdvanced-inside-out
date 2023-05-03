package domain;

import adapter.in.remote.CommandConverter;
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
        rover = new Rover();
    }

    @Test
    void give_direction_N_when_no_commands() {

        assertEquals("N", rover.direction());

    }






}
