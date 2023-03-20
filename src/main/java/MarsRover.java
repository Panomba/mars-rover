public class MarsRover {

    private MarsRoverState marsRoverState;

    public MarsRover() {
        marsRoverState = new MarsRoverNorthState(0, 0, 'N');
    }

    public MarsRover(int x, int y, char direction) {
        switch (direction) {
            case 'E' -> marsRoverState = new MarsRoverEastState(x, y, direction);
            case 'S' -> marsRoverState = new MarsRoverSouthState(x, y, direction);
            case 'W' -> marsRoverState = new MarsRoverWestState(x, y, direction);
            default -> marsRoverState = new MarsRoverNorthState(x, y, direction);
        }
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
            if ('L' == command.charAt(i)) marsRoverState = marsRoverState.turnLeft();
            else if ('R' == command.charAt(i)) marsRoverState = marsRoverState.turnRight();
            else if ('M' == command.charAt(i)) marsRoverState = marsRoverState.moveForward();
    }

}
