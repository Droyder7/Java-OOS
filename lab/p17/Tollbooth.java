// Imagine a toll booth and a bridge. Cars passing by the booth are expected to pay an amount of Rs. 50/- as toll tax. Mostly they do but sometimes a car goes by without paying. The toll booth keeps track of the number of the cars that have passed without paying, total number of cars passed by, and the total amount of money collected. Execute this with a class called “Tollbooth” and print out the result as follows:
// The total number of cars passed by without paying.
// Total number of cars passed by.
// Total cash collected

class Tollbooth
{
    int car, nCar, cash;

    void carPassed()
    {
        car++;
        cash+=50;
    }

    void carPassedWithoutPaying()
    {
        nCar++;
    }

    void show()
    {
        System.out.println("Total number of cars passed by without paying : "+nCar);
        System.out.println("Total number of cars passed by : "+car);
        System.out.println("Total cash collected : "+cash);
    }

    public static void main(String args[])
    {
        Tollbooth tb = new Tollbooth();

        tb.carPassed();
        tb.carPassedWithoutPaying();

        tb.show();
    }
}