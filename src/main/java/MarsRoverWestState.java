public class MarsRoverWestState implements MarsRoverState {
    private final int x;
    private final int y;
    private final char direction;

    public MarsRoverWestState(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = 'W';
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public char direction() {
        return direction;
    }

    public MarsRoverState turnLeft() {
        return new MarsRoverSouthState(x, y);
    }

    public MarsRoverState turnRight() {
        return new MarsRoverNorthState(x, y);
    }

    public MarsRoverState moveForward() {
        return new MarsRoverWestState(x - 1, y);
    }
}