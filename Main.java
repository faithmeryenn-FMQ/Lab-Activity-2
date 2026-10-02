public class Main
{
    public static void main(String[] args)
    {
        Vehicle v1 = new Vehicle("Toyota", "Corolla ", 2020);
        Vehicle v2 = new Vehicle("Honda", "Civic", 2020);
        Vehicle v3 = new Vehicle("Ford ", "Mustang ", 2020);

        v1.displayInfo();
            System.out.println("Age: " + v1.calculateAge());
            System.out.println("Vintage: " + v1.calculateVintage());

         v2.displayInfo();
            System.out.println("Age: " + v2.calculateAge());
            System.out.println("Vintage: " + v2.calculateVintage());
        
        v3.displayInfo();
           System.out.println("Age: " + v3.calculateAge());
            System.out.println("Vintage: " + v3.calculateVintage());

    }
}