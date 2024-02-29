package nus.iss.car;

public class Honda extends Car {

    public Honda() {
        this.setMake("HONDA");
    }

    @Override
    public void horn() {
        System.out.println("!!!! HORN !!!!");
    }

}
