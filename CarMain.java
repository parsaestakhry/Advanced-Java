class Car {
    public void drive() {
        System.out.println("Driving a car ");
    }
    
    public void playMusic() {
        System.out.println("Play Music");
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.playMusic();
    }
}
