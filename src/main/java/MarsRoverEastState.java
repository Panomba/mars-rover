public class MarsRoverEastState implements MarsRoverState {
    private int x;
    private int y;
    private char direction;

    public MarsRoverEastState(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
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
        if (direction == 'N') direction = 'W';
        else if (direction == 'W') direction = 'S';
        else if (direction == 'S') direction = 'E';
        else direction = 'N';
        return this;
    }

    @Override
    public MarsRoverState turnRight() {
        if (direction == 'E') direction = 'S';
        else if (direction == 'S') direction = 'W';
        else if (direction == 'W') direction = 'N';
        else direction = 'E';
        return this;
    }

    @Override
    public MarsRoverState moveForward() {
        if (direction == 'N') y = y + 1;
        else if (direction == 'S') y = y - 1;
        else if (direction == 'W') x = x - 1;
        else x = x + 1;
        return this;
    }
}