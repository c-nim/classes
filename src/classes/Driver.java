package classes;

public class Driver {

    Car car;
    Position position;
    public Driver() {

    }

    public static void main(String[] args) {
        Car myPolo = new Car("red", "SV127BV", "Polo", "VW", 20000 );
        Driver clara = new Driver();
        clara.setCar(myPolo);
        Position imHere = new Position(10, 5);
        clara.setPosition(imHere);
        System.out.println(myPolo.getPosition().getX());



    }
    //setters
    public void setCar(Car car) {
        this.car = car;
    }

    public void setPosition(Position position) {
        if (car != null) {
            this.car.setPosition(position);
        } else {
            System.out.println("no car to set position");
        }
    }
    public Car getCar() {
        return car;
    }
    public void drive(int milesDriven) {
        if(this.car == null) {
            System.out.println("set a car");
        } else {
           car.increaseMiles(milesDriven);
        }
    }


}
