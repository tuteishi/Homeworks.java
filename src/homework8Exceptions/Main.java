package homework8Exceptions;

public class Main {
    public static void main(String[] args) {
        RoomArea roomArea = new RoomArea();
        try {
            roomArea.getRoomArea();
        } catch (BigNumberException e) {
            e.printStackTrace();
        } finally {
            System.err.println("Room area is 0/negative/very large.");
        }
    }
}