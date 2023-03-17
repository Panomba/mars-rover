import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is south and rover moves forward")
class WhenDirectionIsSouthAndRoverMovesForwardTest {

    @Test
    @DisplayName("then y should be -1")
    void thenYShouldBe1() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'S');
        //ACT
        rover.execute("M");
        //ASSERT
        assertThat(rover.y()).isEqualTo(-1);
    }

    @Test
    @DisplayName("then y should be -2 if rover moves twice")
    void thenYShouldBe2IfRoverMovesTwice() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'S');
        //ACT
        rover.execute("MM");
        //ASSERT
        assertThat(rover.y()).isEqualTo(-2);
    }

}
