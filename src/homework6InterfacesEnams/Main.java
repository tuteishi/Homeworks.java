package homework6InterfacesEnams;
public class Main {
    public static void main(String[] args) {
        Robot[] robots = new Robot[9];
        robots [0] = new Robot("R2-D2");
        robots [1] = new Robot("C-3PO");
        robots [2] = new Robot("Terminator");
        robots [3] = new Robot("David");
        robots [4] = new Robot("Robocop");
        robots [5] = new Robot("Sonny");
        robots [6] = new Robot("Andry");
        robots [7] = new Robot("Marvin");
        robots [8] = new Robot("Model X");
        for (Robot robot : robots) {
            System.out.println(robot);
        }
    }
}