public interface MarsRoverState {
    int x();

    int y();

    char direction();

    void turnLeft();

    void turnRight();

    void moveForward();
}
