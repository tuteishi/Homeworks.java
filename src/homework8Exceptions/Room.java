package homework8Exceptions;

public class Room {
    private double sideA;
    private double sideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA)  throws NegativeNumberException, ZeroNumberException{
        if (sideA < 0) {
            throw  new NegativeNumberException("Entered number is negative");
        } else if (sideA == 0 ) {
            throw  new ZeroNumberException("Zero not allowed");
        }
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) throws NegativeNumberException, ZeroNumberException {
        if (sideB < 0) {
            throw  new NegativeNumberException("Entered number is negative");
        } else if (sideB == 0) {
            throw  new ZeroNumberException("Zero not allowed");
        }
        this.sideB = sideB;
    }
}