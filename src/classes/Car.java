package classes;

public class Car {

    private String colour;
    private String reg;
    private String model;
    private String make;
    private int miles;
    private Position position = new Position(0, 0);

    public Car(String colour, String reg, String model, String make, int miles) {
        this.colour = colour;
        this.reg = reg;
        this.model = model;
        this.make = make;
        this.miles = miles;
    }

    public static void main(String[] args) {

    }
    //setters
    public void increaseMiles(int milesAdded) {
        this.miles += milesAdded;
    }
    public void setColour(String colourInput) {
        this.colour = colourInput;
    }

    public void setPosition( Position position) {
        this.position = position;
    }
    //getters
    public Position getPosition() {

        return position;
    }
    public String getReg() {
        return reg;
    }
    public String getModel() {
        return model;
    }
    public String getMake() {
        return make;
    }
    public int getMiles() {
        return miles;
    }
    public String getColour() {
        return colour;
    }
}
