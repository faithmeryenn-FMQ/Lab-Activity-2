public class Main
{
     public static void main (String[] args)
     {
         Vehicle v1 = new Vehicle();
         Vehicle v2 = new Vehicle();
         Vehicle v3 = new Vehicle();
         
         v1.brand = " Toyota";
         v1.model = " Corolla";
         v1.year = 2020;
         v1.displayInfo();
         System.out.println("Age: " + v1.calculateAge());
         System.out.println("Vintage: " + v1.calculateVintage());
         
         v2.brand = " Honda";
          v2.model = " Civic ";
         v2.year = 2020;
         v2.displayInfo();
         System.out.println("Age: " + v2.calculateAge());
         System.out.println("Vintage: " + v2.calculateVintage());
         
          v3.brand = " Ford";
          v3.model = " Mustang";
         v3.year = 2010;
         v3.displayInfo();
         System.out.println("Age: " + v3.calculateAge());
         System.out.println("Vintage: " + v3.calculateVintage());

         
              }
}