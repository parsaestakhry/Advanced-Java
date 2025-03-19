abstract class Car {

    // abstract: i give you the method but you should implement it your self
    public abstract void drive();

    public void playMusic() {
        System.out.println("Play Music");
    }
}

// this class must implement the abstract method defined by the car class
class WagonR extends Car {
    public void drive() {

    }

}

public class CarMain {
    public static void main(String[] args) {

    }
}