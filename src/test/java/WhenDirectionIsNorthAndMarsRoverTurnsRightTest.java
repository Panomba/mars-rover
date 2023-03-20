import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is north and rover turns right")
class WhenDirectionIsNorthAndMarsRoverTurnsRightTest {

    @Test
    @DisplayName("then direction should be east")
    void thenDirectionShouldBeEast() {
        //ARRANGE
        MarsRover marsRover = new MarsRover();
        //ACT
        marsRover.execute("R");
        //ASSERT
        assertThat(marsRover.direction()).isEqualTo('E');
    }


}
