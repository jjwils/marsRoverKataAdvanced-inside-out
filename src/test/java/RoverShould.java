import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class RoverShould {

    @Mock
    CommandConverter commandConverter;


    @Test
    void use_the_command_convertor(){

        Rover rover = new Rover();

        rover.moves("RL");

        verify(commandConverter).stringToEnum(any());

    }

}