import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is north and rover turns left")
class WhenDirectionIsNorthAndMarsRoverTurnsLeftTest {

    @Test
    @DisplayName("then direction should be west")
    void thenDirectionShouldBeWest() {
        //ARRANGE
        MarsRover marsRover = new MarsRover(new MarsRoverNorthState(0, 0));
        //ACT
        marsRover.execute("L");
        //ASSERT
        assertThat(marsRover.direction()).isEqualTo('W');
    }

}
