package classes;

public class Position {

    double x;
    double y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;


    }
    public void setPosition( double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
