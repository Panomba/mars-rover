import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is north and rover turns left")
class WhenDirectionIsNorthAndRoverTurnsLeftTest {

    @Test
    @DisplayName("then direction should be west")
    void thenDirectionShouldBeWest() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'N');
        //ACT
        rover.execute("L");
        //ASSERT
        assertThat(rover.direction()).isEqualTo('W');
    }

}
