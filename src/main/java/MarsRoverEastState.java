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
    public void turnLeft() {
        if (direction == 'N') direction = 'W';
        else if (direction == 'W') direction = 'S';
        else if (direction == 'S') direction = 'E';
        else direction = 'N';
    }

    @Override
    public void turnRight() {
        if (direction == 'E') direction = 'S';
        else if (direction == 'S') direction = 'W';
        else if (direction == 'W') direction = 'N';
        else direction = 'E';
    }

    @Override
    public void moveForward() {
        if (direction == 'N') y = y + 1;
        else if (direction == 'S') y = y - 1;
        else if (direction == 'W') x = x - 1;
        else x = x + 1;
    }
}