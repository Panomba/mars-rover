import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is west and rover moves forward")
class WhenDirectionIsWestAndRoverMovesForwardTest {

    @Test
    @DisplayName("then x should be equal to -1")
    void thenXShouldBeEqualTo1() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'W');
        //ACT
        rover.execute("M");
        //ASSERT
        assertThat(rover.x()).isEqualTo(-1);
    }

    @Test
    @DisplayName("then x should be equal to -2 if rover moves twice")
    void thenXShouldBeEqualTo2IfRoverMovesTwice() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'W');
        //ACT
        rover.execute("MM");
        //ASSERT
        assertThat(rover.x()).isEqualTo(-2);
    }

}
