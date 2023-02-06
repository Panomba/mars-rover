public class Rover {

    private int x = 0;
    private int y = 0;
    private char direction = 'N';

    public Rover() {
        this.x = 0;
        this.y = 0;
        this.direction = 'N';
    }

    public Rover(int x, int y, char direction) {
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

    public void execute(String command) {
        for (int i = 0; i < command.length(); i++) {
            if ('L' == command.charAt(i)) {
                if (direction == 'N') direction = 'W';
                else if (direction == 'W') direction = 'S';
                else if (direction == 'S') direction = 'E';
                else direction = 'N';
            } else if ('R' == command.charAt(i)) {
                if (direction == 'E') direction = 'S';
                else if (direction == 'S') direction = 'W';
                else if (direction == 'W') direction = 'N';
                else direction = 'E';
            } else if ('M' == command.charAt(i)) {
                if (direction == 'N') y = y + 1;
                else if (direction == 'S') y = -1;
                else if (direction == 'W') x = -1;
                else x = 1;
            }
        }
    }
}
