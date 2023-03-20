import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is north and rover moves forward")
class WhenDirectionIsNorthAndMarsRoverMovesForwardTest {

    @Test
    @DisplayName("then y should be 1")
    void thenYShouldBe1() {
        //ARRANGE
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        //ACT
        marsRover.execute("M");
        //ASSERT
        assertThat(marsRover.y()).isEqualTo(1);
    }

    @Test
    @DisplayName("then y should be 2 if rover moves twice")
    void thenYShouldBe2IfRoverMovesTwice() {
        //ARRANGE
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        //ACT
        marsRover.execute("MM");
        //ASSERT
        assertThat(marsRover.y()).isEqualTo(2);
    }

}
