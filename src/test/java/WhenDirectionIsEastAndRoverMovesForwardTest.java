import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When direction is east and rover moves forward")
class WhenDirectionIsEastAndRoverMovesForwardTest {

    @Test
    @DisplayName("then x should be 1")
    void thenXShouldBe1() {
        //ARRANGE
        Rover rover = new Rover(0, 0, 'E');
        //ACT
        rover.execute("M");
        //ASSERT
        assertThat(rover.x()).isEqualTo(1);
    }

}
