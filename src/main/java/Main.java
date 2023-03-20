public class Main {

    public static void main(String[] args) {
        MarsRover marsRover = new MarsRover();
        marsRover.execute("MMRMMLM");
        System.out.println(String.format(
                "%d:%d:%s",
                marsRover.x(),
                marsRover.y(),
                marsRover.direction()));
    }

}
