import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is west and rover turns right")
class WhenDirectionIsWestAndRoverTurnsRightTest {

    @Test
    @DisplayName("then direction should be north")
    void thenDirectionShouldBeNorth() {
        //ARRANGE
        MarsRover marsRover = new MarsRover(new MarsRoverWestState(0, 0));
        //ACT
        marsRover.execute("R");
        //ASSERT
        assertThat(marsRover.direction()).isEqualTo('N');
    }

}
