
import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        double tankCapacity ;
        double mpg;
        double gasPrice;
        String trash = "";
        double costToDrive;
        double miles = 100;
        double drivingDistance;
        Scanner in = new Scanner(System.in);


        System.out.println("Enter your gas tank capacity in gallons");
        //tankCapacity = in.nextDouble();
        if (in.hasNextDouble())
            {
                tankCapacity = in.nextDouble();
                in.nextLine();  // clear the buffer

            }
        else
            {
                trash = in.nextLine();
                System.out.println("Bad value for tank capacity: " + trash);
            }
        System.out.println("Enter your mpg value");
        if (in.hasNextDouble());
            {
                mgp = in.nextDouble();
                in.nextLine();
            }
        else
            {
                trash = in.nextLine();
                System.out.println("Bad value for mpg: " + trash);
            }
        System.out.println("Enter the price of gas per gallon");
         if (in.hasNextDouble());
            {
                gasPrice = in.nextDouble();
                in.nextLine();
            }
        else
            {
                trash = in.nextLine();
                System.out.println("Bad value for gas price: " + trash);
            }
            costToDrive = (tankCapacity / miles) * gasPrice;
            drivingDistance = mpg * tankCapacity;
            System.out.println("It cost " + costToDrive + " to drive 100 miles");
            System.out.println("You can drive " + drivingDistance + " miles on a tank of gas");
    }
}