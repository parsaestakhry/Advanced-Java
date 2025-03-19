abstract class Car {

    // abstract: i give you the method but you should implement it your self
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Play Music");
    }
}

// this class must implement the abstract method defined by the car class
class WagonR extends Car {
    public void drive() {
        System.out.println("driving ");
    }

    public void fly() {

        System.out.println("flying");
    }

}

public class CarMain {
    public static void main(String[] args) {
        WagonR wagonR = new WagonR();
        wagonR.drive();
        wagonR.fly();
    }
}