/**
 * Gabriel Mazza
 * gkm5395
 * IST 140-DistanceCalc
 */




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Use a Scanner object to capture two double values from the user at the command line

            Scanner Distance = new Scanner(System.in);

        //the number of gallons for the vehicle's fuel tank stored as gallons.

            System.out.println("How Many gallons of fuel do we have?");
            double g = Distance.nextDouble();


        //the vehicle fuel efficiency (miles per gallon) stored as mpg.

            System.out.println("How many Miles Per Gallon do we get?");
            Double mpg = Distance.nextDouble();
        //Create a variable 'distance' that stores the calculated value of the number of total miles the vehicle can travel on the available fuel (gallons * mpg)

            Double D = g*mpg;
            //Your program should output: "You are able to travel X.XX miles on remaining fuel." where X.XX is the miles distance you calculated.

            System.out.printf("You are able to travel %.2f miles on the remaining fuel", + D);







    }
}