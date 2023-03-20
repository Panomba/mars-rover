public class MarsRoverWestState implements MarsRoverState {
    private int x;
    private int y;
    private char direction;

    public MarsRoverWestState(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
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
        return new MarsRoverSouthState(x, y, 'S');
    }

    public MarsRoverState turnRight() {
        return new MarsRoverNorthState(x, y, 'N');
    }

    public MarsRoverState moveForward() {
        if (direction == 'N') y = y + 1;
        else if (direction == 'S') y = y - 1;
        else if (direction == 'W') x = x - 1;
        else x = x + 1;
        return this;
    }
}