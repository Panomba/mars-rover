import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is east and rover turns right")
class WhenDirectionIsEastAndRoverTurnsRightTest {

    @Test
    @DisplayName("then direction should be south")
    void thenDirectionShouldBeSouth() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'E');
        //ACT
        rover.execute("R");
        //ASSERT
        assertThat(rover.direction()).isEqualTo('S');
    }

}
