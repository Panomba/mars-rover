public class Rover {

    private int x = 0;
    private int y = 0;
    private char direction = 'N';

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
        direction = 'E';
    }
}
