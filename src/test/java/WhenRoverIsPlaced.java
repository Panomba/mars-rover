import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("When rover is placed")
class WhenRoverIsPlaced {

    @Test
    @DisplayName("then x should be 0 y should be 0 and direction should be North")
    void thenXShouldBe0YShouldBe0AndDirectionShouldBeNorth() {
        //ARRANGE
        MarsRover marsRover;
        //ACT
        marsRover = new MarsRover();
        //ASSERT
        assertThat(marsRover.x()).isZero();
        assertThat(marsRover.y()).isZero();
        assertThat(marsRover.direction()).isEqualTo('N');
    }

}
