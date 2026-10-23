public class Main{

 public static void printDetails(Vehicle vehicle){
 vehicle.displayInfo();
 }
 
 public static void main(String[] args){
  Vehicle vehicle = new Truck("Fuso", "Fuso FJ 2828R", 2026, 10);
  vehicle.displayInfo();
  
  System.out.println();

   vehicle = new Car("Ford", "Ranger", 2020, 4);
   vehicle.displayInfo();
   
  vehicle = new Motorcycle("Yamaha", "Raider Fi", 2017, "150cc");
   vehicle.displayInfo();
   
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
      new Motorcycle("Yamaha", "Raider Fi", 2017, "150cc"),
};

   for(Vehicle currentVehicle: vehicles){
      printDetails(currentVehicle);
   


   
   
   

   
   
 }
}
 }