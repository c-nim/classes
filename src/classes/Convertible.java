package classes;

public class Convertible extends Car {
    boolean isSoftTop;
    int numSeats;
    public Convertible(String colour, String reg, String model, String make, int miles, boolean isSoftTop, int numSeats) {
        super(colour, reg , model, make, miles);
        this.isSoftTop = isSoftTop;
        this.numSeats = numSeats;
    }

    public void setSeats(int seats) {
        numSeats = seats;
    }

}
