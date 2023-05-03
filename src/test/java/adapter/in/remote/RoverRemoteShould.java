package adapter.in.remote;

import domain.Rover;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoverRemoteShould {

    private RoverRemote roverRemote;
    private Rover rover;

    @BeforeEach
    void initialize() {
        rover = new Rover();
        roverRemote = new RoverRemote(rover);

    }

    @ParameterizedTest
    @CsvSource( {"RL,N", "RRRR,N", "R,E", "L,W", "RR,S"  })
    void give_direction_when_command(String command,String direction) {

        //act
        roverRemote.moves(command);

        //assert
        assertEquals(direction, rover.direction());
    }

    @Test
    void give_error_when_command_isNull() {
        assertThrows(IllegalArgumentException.class, () -> roverRemote.moves(null) , "domain.Command is null" );
    }

    @Test
    void give_error_when_command_is_not_allowed() {
        assertThrows(
                IllegalArgumentException.class,
                () -> roverRemote.moves( "Z") ,
                "domain.Command is invalid"
        );
    }

}


