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

    public void turnLeft() {
        if (direction == 'N') direction = 'W';
        else if (direction == 'W') direction = 'S';
        else if (direction == 'S') direction = 'E';
        else direction = 'N';
    }

    public void turnRight() {
        if (direction == 'E') direction = 'S';
        else if (direction == 'S') direction = 'W';
        else if (direction == 'W') direction = 'N';
        else direction = 'E';
    }

    public void moveForward() {
        if (direction == 'N') y = y + 1;
        else if (direction == 'S') y = y - 1;
        else if (direction == 'W') x = x - 1;
        else x = x + 1;
    }
}