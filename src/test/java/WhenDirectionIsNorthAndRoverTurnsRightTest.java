import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is north and rover turns right")
class WhenDirectionIsNorthAndRoverTurnsRightTest {

    @Test
    @DisplayName("then direction should be east")
    void thenDirectionShouldBeEast() {
        //ARRANGE
        Rover rover = new Rover();
        //ACT
        rover.execute("R");
        //ASSERT
        assertThat(rover.direction()).isEqualTo('E');
    }


}
