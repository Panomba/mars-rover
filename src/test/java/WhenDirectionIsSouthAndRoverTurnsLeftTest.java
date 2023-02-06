import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is south and rover turns left")
class WhenDirectionIsSouthAndRoverTurnsLeftTest {

    @Test
    @DisplayName("then direction should be east")
    void thenDirectionShouldBeEast() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'S');
        //ACT
        rover.execute("L");
        //ASSERT
        assertThat(rover.direction()).isEqualTo('E');
    }

}
