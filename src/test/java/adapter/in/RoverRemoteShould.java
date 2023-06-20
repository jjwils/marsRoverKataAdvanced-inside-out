package adapter.in;

import domain.CommandConverter;
import domain.Rover;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoverRemoteShould {

    private Rover rover;
    private RoverRemote roverRemote;

    @BeforeEach
    void initialize() {
        rover = new Rover();
        roverRemote = new RoverRemote(rover);

    }

    @ParameterizedTest
    @CsvSource({"RL,N", "RRRR,N", "R,E", "L,W", "RR,S"})
    void give_direction_when_command(String command, String direction) {
        //arrange

        //act
        roverRemote.moves(command);

        //assert
        assertEquals(direction, rover.direction());
    }
    @Test
    void give_error_when_command_is_not_allowed() {
        assertThrows(
                IllegalArgumentException.class,
                () -> roverRemote.moves("Z"),
                "domain.Command is invalid"
        );
    }
    @Test
    void give_error_when_command_isNull() {
        assertThrows(IllegalArgumentException.class, () -> roverRemote.moves(null),
                "domain.Command is null");
    }

    @Test
    void move_forward_one_space(){
        //arrange

        //act
        roverRemote.moves("M");

        //assert
        assertEquals("0,1", rover.position());

    }


    @Test
    void move_forward_two_spaces(){
        //arrange

        //act
        roverRemote.moves("MM");

        //assert
        assertEquals("0,2", rover.position());

    }

    @Test
    void move_left_then_forward(){
        //arrange

        //act
        roverRemote.moves("LM");

        //assert
        assertEquals("1,0", rover.position());
    }
    @Test
    void move_right_then_forward(){
        //arrange

        //act
        roverRemote.moves("RM");

        //assert
        assertEquals("-1,0", rover.position());
    }
}
