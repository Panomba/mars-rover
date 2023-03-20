import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is east and rover turns right")
class WhenDirectionIsEastAndMarsRoverTurnsRightTest {

    @Test
    @DisplayName("then direction should be south")
    void thenDirectionShouldBeSouth() {
        //ARRANGE
        MarsRover marsRover = new MarsRover(new MarsRoverEastState(0, 0));
        //ACT
        marsRover.execute("R");
        //ASSERT
        assertThat(marsRover.direction()).isEqualTo('S');
    }

}
