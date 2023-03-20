public interface MarsRoverState {
    int x();

    int y();

    char direction();

    MarsRoverState turnLeft();

    MarsRoverState turnRight();

    MarsRoverState moveForward();
}
