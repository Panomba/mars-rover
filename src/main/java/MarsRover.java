public class MarsRover {

    private MarsRoverState marsRoverState;

    public MarsRover() {
        marsRoverState = new MarsRoverNorthState(0, 0);
    }

    MarsRover(MarsRoverState marsRoverState) {
        this.marsRoverState = marsRoverState;
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
