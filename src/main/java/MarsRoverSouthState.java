public class MarsRoverSouthState implements MarsRoverState {
    private int x;
    private int y;
    private char direction;

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
        if (direction == 'N') y = y + 1;
        else if (direction == 'S') y = y - 1;
        else if (direction == 'W') x = x - 1;
        else x = x + 1;
        return this;
    }
}