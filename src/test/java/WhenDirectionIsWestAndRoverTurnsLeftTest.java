import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is west and rover turns left")
class WhenDirectionIsWestAndRoverTurnsLeftTest {

    @Test
    @DisplayName("then direction should be south")
    void thenDirectionShouldBeSouth() {
        //ARRANGE
        MarsRover marsRover = new MarsRover(0, 0, 'W');
        //ACT
        marsRover.execute("L");
        //ASSERT
        assertThat(marsRover.direction()).isEqualTo('S');
    }

}
