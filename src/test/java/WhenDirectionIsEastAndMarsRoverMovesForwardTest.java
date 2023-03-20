import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is east and rover moves forward")
class WhenDirectionIsEastAndMarsRoverMovesForwardTest {

    @Test
    @DisplayName("then x should be 1")
    void thenXShouldBe1() {
        //ARRANGE
        MarsRover marsRover = new MarsRover(0, 0, 'E');
        //ACT
        marsRover.execute("M");
        //ASSERT
        assertThat(marsRover.x()).isEqualTo(1);
    }

    @Test
    @DisplayName("then x should be 2 if rover moves twice")
    void thenXShouldBe2IfRoverMovesTwice() {
        //ARRANGE
        MarsRover marsRover = new MarsRover(0, 0, 'E');
        //ACT
        marsRover.execute("MM");
        //ASSERT
        assertThat(marsRover.x()).isEqualTo(2);
    }

}
