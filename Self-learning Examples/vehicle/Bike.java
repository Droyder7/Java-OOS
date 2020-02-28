package vehicle;
//import vehicle.vehicles;
/**
 * Bike
 */
        // cannot find symbol error
public class Bike implements vehicles
{
    public void speed()
    {
        System.out.println("High");
    }
    
    public void mileage()
    {
        System.out.println("2.5");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.speed();
        b.mileage();
    }
}