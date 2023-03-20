public class MarsRoverEastState implements MarsRoverState {
    private final int x;
    private final int y;
    private final char direction;

    public MarsRoverEastState(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = 'E';
    }

    @Override
    public int x() {
        return x;
    }

    @Override
    public int y() {
        return y;
    }

    @Override
    public char direction() {
        return direction;
    }

    @Override
    public MarsRoverState turnLeft() {
        return new MarsRoverNorthState(x, y);
    }

    @Override
    public MarsRoverState turnRight() {
        return new MarsRoverSouthState(x, y);
    }

    @Override
    public MarsRoverState moveForward() {
        return new MarsRoverEastState(x + 1, y);
    }
}