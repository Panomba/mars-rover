import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is west and rover turns right")
class WhenDirectionIsWestAndRoverTurnsRightTest {

    @Test
    @DisplayName("then direction should be north")
    void thenDirectionShouldBeNorth() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'W');
        //ACT
        rover.execute("R");
        //ASSERT
        assertThat(rover.direction()).isEqualTo('N');
    }

}
