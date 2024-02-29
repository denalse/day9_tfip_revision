package nus.iss.car;

import java.util.UUID;

public class Car {

    public static int wheels; // smth like global variable, belongs to class

    private String make;
    private String owner;
    private String registration;

    public static int getWheels() {
        return wheels;
    }

    public static void setWheels(int wheels) {
        Car.wheels = wheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    // smth like global methods, belongs to class
    public static void assignRegistration(Car car) {
        String reg = UUID.randomUUID().toString().substring(0, 8);
        car.setRegistration(reg);
    }

    public void generateRegistration() {
        setRegistration(UUID.randomUUID().toString().substring(0, 8));
    }

    public void horn() {
        System.out.printf("honk!, honk!\n");
    }

}
