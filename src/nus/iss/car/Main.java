package nus.iss.car;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Car\n");

        Car car1 = new Car();
        car1.setMake("toyota");
        Car.assignRegistration(car1);

        Car car2 = new Car();
        car2.setMake("audi");
        Car.assignRegistration(car2);

        car1.setWheels(4);
        System.out.printf("1. toyota: %s, %s, %d\n", 
            car1.getRegistration(), car1.getMake(), car1.getWheels());
        car1.horn();
        
        car2.setWheels(2);
        System.out.printf("2. audi: %s, %s, %d\n", 
            car2.getRegistration(), car2.getMake(), car2.getWheels());

        System.out.printf("3. toyota: %s, %d\n", car1.getMake(), car1.getWheels());

        Honda civic = new Honda();
    
        System.out.printf("4. civic: %s, %d\n", civic.getMake(), civic.getWheels());
        civic.horn();

        Audi a3 = new Audi();

        a3.horn();
        a3.stop();
    
    }
    
}
