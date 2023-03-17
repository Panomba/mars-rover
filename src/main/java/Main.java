public class Main {

    public static void main(String[] args) {
        Rover rover = new Rover();
        rover.execute("MMRMMLM");
        System.out.println(String.format(
                "%d:%d:%s",
                rover.x(),
                rover.y(),
                rover.direction()));
    }

}
