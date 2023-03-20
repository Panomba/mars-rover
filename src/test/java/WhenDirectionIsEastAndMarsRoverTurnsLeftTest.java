import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is east and rover turns left")
class WhenDirectionIsEastAndMarsRoverTurnsLeftTest {

    @Test
    @DisplayName("then direction should be north")
    void thenDirectionShouldBeNorth() {
        //ARRANGE
        MarsRover marsRover = new MarsRover(new MarsRoverEastState(0, 0));
        //ACT
        marsRover.execute("L");
        //ASSERT
        assertThat(marsRover.direction()).isEqualTo('N');
    }

}
