public class MarsRover {

    private MarsRoverState marsRoverState;

    public MarsRover() {
        marsRoverState = new MarsRoverNorthState(0, 0);
    }

    public MarsRover(int x, int y, char direction) {
        switch (direction) {
            case 'E' -> marsRoverState = new MarsRoverEastState(x, y);
            case 'S' -> marsRoverState = new MarsRoverSouthState(x, y);
            case 'W' -> marsRoverState = new MarsRoverWestState(x, y);
            default -> marsRoverState = new MarsRoverNorthState(x, y);
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
