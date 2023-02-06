import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is east and rover turns left")
class WhenDirectionIsEastAndRoverTurnsLeft {

    @Test
    @DisplayName("then direction should be north")
    void thenDirectionShouldBeNorth() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'E');
        //ACT
        rover.execute("L");
        //ASSERT
        assertThat(rover.direction()).isEqualTo('N');
    }

}
