public class Car extends Vehicle {

    int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    @Override
    public void moveForward() {
        System.out.println("A Car moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A Car moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A Car moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A Car moves right");
    }
}
   
    