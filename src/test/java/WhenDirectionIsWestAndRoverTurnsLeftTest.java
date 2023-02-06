import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is west and rover turns left")
class WhenDirectionIsWestAndRoverTurnsLeftTest {

    @Test
    @DisplayName("then direction should be south")
    void thenDirectionShouldBeSouth() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'W');
        //ACT
        rover.execute("L");
        //ASSERT
        assertThat(rover.direction()).isEqualTo('S');
    }

}
