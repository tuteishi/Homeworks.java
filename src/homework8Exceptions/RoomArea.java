package homework8Exceptions;

import java.util.Random;

public class RoomArea {
    public void getRoomArea() throws BigNumberException {

        Room room = new Room();

        try {
            room.setSideA(0);
        } catch (NegativeNumberException | ZeroNumberException e) {
            e.printStackTrace();
        } finally {
            System.err.println("\n" + "The entered value is negative/0");
        }

        try {
            room.setSideB(-1);
        } catch (NegativeNumberException | ZeroNumberException e) {
            e.printStackTrace();
        } finally {
            System.err.println("\n" + "The entered value is negative/0");
        }

        double roomArea = room.getSideA() * room.getSideB();
        if (roomArea > 50) {
            throw new BigNumberException("Very large area");
        }
    }
}