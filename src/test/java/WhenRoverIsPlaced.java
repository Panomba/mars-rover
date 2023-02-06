import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When rover is placed")
class WhenRoverIsPlaced {

    @Test
    @DisplayName("then x should be 0 y should be 0 and direction should be North")
    void thenXShouldBe0YShouldBe0AndDirectionShouldBeNorth() {
        //ARRANGE
        Rover rover;
        //ACT
        rover = new Rover();
        //ASSERT
        assertThat(rover.x()).isZero();
        assertThat(rover.y()).isZero();
        assertThat(rover.direction()).isEqualTo('N');
    }

}
