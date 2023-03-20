public class MarsRoverSouthState implements MarsRoverState {
    private final int x;
    private final int y;
    private final char direction;

    public MarsRoverSouthState(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = 'S';
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
        return new MarsRoverEastState(x, y);
    }

    public MarsRoverState turnRight() {
        return new MarsRoverWestState(x, y);
    }

    public MarsRoverState moveForward() {
        return new MarsRoverSouthState(x, y - 1);
    }
}