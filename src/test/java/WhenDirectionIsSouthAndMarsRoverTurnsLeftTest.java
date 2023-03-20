import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is south and rover turns left")
class WhenDirectionIsSouthAndMarsRoverTurnsLeftTest {

    @Test
    @DisplayName("then direction should be east")
    void thenDirectionShouldBeEast() {
        //ARRANGE
        MarsRover marsRover = new MarsRover(new MarsRoverSouthState(0, 0));
        //ACT
        marsRover.execute("L");
        //ASSERT
        assertThat(marsRover.direction()).isEqualTo('E');
    }

}
