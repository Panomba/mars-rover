public class MarsRover {

    private final MarsRoverState marsRoverState;

    public MarsRover() {
        marsRoverState = new MarsRoverState(0, 0, 'N');
        this.marsRoverState.x = 0;
        this.marsRoverState.y = 0;
        this.marsRoverState.direction = 'N';
    }

    public MarsRover(int x, int y, char direction) {
        marsRoverState = new MarsRoverState(x, y, direction);
        this.marsRoverState.x = x;
        this.marsRoverState.y = y;
        this.marsRoverState.direction = direction;
    }

    public int x() {
        return marsRoverState.x();
    }

    public int y() {
        return marsRoverState.y();
    }

    public char direction() {
        return marsRoverState.direction();
    }

    public void execute(String command) {
        for (int i = 0; i < command.length(); i++)
            if ('L' == command.charAt(i)) marsRoverState.turnLeft();
            else if ('R' == command.charAt(i)) marsRoverState.turnRight();
            else if ('M' == command.charAt(i)) marsRoverState.moveForward();
    }

    private void turnLeft() {
        marsRoverState.turnLeft();
    }

    private void turnRight() {
        marsRoverState.turnRight();
    }

    private void moveForward() {
        marsRoverState.moveForward();
    }

}
