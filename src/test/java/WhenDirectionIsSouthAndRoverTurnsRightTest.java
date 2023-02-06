import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is south and rover turns right")
class WhenDirectionIsSouthAndRoverTurnsRightTest {

    @Test
    @DisplayName("then direction should be west")
    void thenDirectionShouldBeWest() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'S');
        //ACT
        rover.execute("R");
        //ASSERT
        assertThat(rover.direction()).isEqualTo('W');
    }

}
