public class MarsRoverNorthState implements MarsRoverState {
    private final int x;
    private final int y;
    private final char direction;

    public MarsRoverNorthState(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = 'N';
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
        return new MarsRoverWestState(x, y);
    }

    public MarsRoverState turnRight() {
        return new MarsRoverEastState(x, y);
    }

    public MarsRoverState moveForward() {
        return new MarsRoverNorthState(x, y + 1);
    }
}