import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is north and rover moves forward")
class WhenDirectionIsNorthAndRoverMovesForwardTest {

    @Test
    @DisplayName("then y should be 1")
    void thenYShouldBe1() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'N');
        //ACT
        rover.execute("M");
        //ASSERT
        assertThat(rover.y()).isEqualTo(1);
    }

    @Test
    @DisplayName("then y should be 2 if rover moves twice")
    void thenYShouldBe2IfRoverMovesTwice() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'N');
        //ACT
        rover.execute("MM");
        //ASSERT
        assertThat(rover.y()).isEqualTo(2);
    }

}
