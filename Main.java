 public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

         public static void performService(Serviceable item){
     item.service();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Truck("Fuso", "Fuso FJ 2828R", 2026, 10);
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Car("Ford", "Ranger", 2020, 4);
        vehicle.displayInfo();

        vehicle = new Motorcycle("Yamaha", "Raider Fi", 2017, "150cc");
        vehicle.displayInfo();
        System.out.println();

        Truck truck = new Truck("Fuso", "Fuso FJ 2828R", 2026, 10);
        printDetails(truck);
        System.out.println();

        Car car = new Car("Ford", "Ranger", 2020, 4);
        printDetails(car);
        System.out.println();

        Motorcycle motor = new Motorcycle("Yamaha", "Raider Fi", 2017, "150cc");
        printDetails(motor);
        System.out.println();

        Vehicle[] vehicles = {
            new Truck("Fuso", "Fuso FJ 2828R", 2026, 10),
            new Car("Ford", "Ranger", 2020, 4),
            new Motorcycle("Yamaha", "Raider Fi", 2017, "150cc")
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            System.out.println();
        }

        for (Vehicle currentVehicle : vehicles) {
    printDetails(currentVehicle);
    currentVehicle.moveForward();
    currentVehicle.moveBackwards();
    currentVehicle.moveLeft();
    currentVehicle.moveRight();
    System.out.println();
}

    Serviceable car2 = new Car("Ford", "Ranger", 2020, 4);
     motor = new Motorcycle("Yamaha", "Raider Fi", 2017, "150cc");
     truck = new Truck("Fuso", "Fuso FJ 2828R", 2026, 10);
      Serviceable printer = new Printer();
      
      Serviceable[] items = {
         car2,
         motor, 
         truck,
         printer
      };
      
      for (Serviceable currentItem: items) {
         performService(currentItem);
     }

    }
}