public class Main
{
    public static void main(String[] args)
    {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();

        v1.brand = "Toyota";
        v1.model = "Corolla";
        v1.year = 2020;
        v1.displayInfo();

        v2.brand = "Honda";
        v2.model = "Civic";
        v2.year = 2020;
        v2.displayInfo();

        v3.brand = "Ford";
        v3.model = "Mustang";
        v3.year = 2010;
        v3.displayInfo();
    }
}