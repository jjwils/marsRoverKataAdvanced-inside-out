package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class RoverShould {
    private Rover rover;


    @BeforeEach
    void initialize() {
        CommandConverter commandConverter = new CommandConverter();
        rover = new Rover();
    }

    @Test
    void give_direction_N_when_no_commands() {

        assertEquals("N", rover.direction());

    }

    @Test
    void throw_illegal_argument_if_null(){

        assertThrows(
                IllegalArgumentException.class,
                () -> rover.move(null),
                "domain.Command is invalid"
        );


    }


    @Test
    void throw_illegal_argument_if_element_null() {
        List<Command> commandList = new ArrayList<>();
        commandList.add(null);

        assertThrows(
                IllegalArgumentException.class,
                () -> rover.move(commandList),
                "domain.Command is invalid"
        );
    }






}
