import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is south and rover turns right")
class WhenDirectionIsSouthAndMarsRoverTurnsRightTest {

    @Test
    @DisplayName("then direction should be west")
    void thenDirectionShouldBeWest() {
        //ARRANGE
        MarsRover marsRover = new MarsRover(new MarsRoverSouthState(0, 0));
        //ACT
        marsRover.execute("R");
        //ASSERT
        assertThat(marsRover.direction()).isEqualTo('W');
    }

}
