public class Main
{
     public static void main (String[] args)
     {
         Vehicle v1 = new Vehicle("Toyota", "Corolla", 2020);
         Vehicle v2 = new Vehicle("Honda", "Civic", 1995);
         Vehicle v3 = new Vehicle("Ford", "Mustang", 2010);
         
         v1.displayInfo();
         v2.displayInfo();
         v3.displayInfo();
     }
}