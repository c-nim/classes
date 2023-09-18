package classes;

import java.sql.SQLOutput;

public class Supercar extends Car {
    private String superPower;
    boolean isFlying = true;
    public Supercar(String colour, String reg, String model, String make, int miles, String superPower) {
        super(colour, reg , model, make, miles);
        this.superPower = "can fly";
    }
    public void setSuperPower(String superPower){
        this.superPower = superPower;
    }
    public void toggleFlying() {
        this.isFlying = !this.isFlying;
    }



}