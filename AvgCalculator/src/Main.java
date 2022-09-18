/**
 * Gabriel Mazza
 * gkm5395
 * IST 140-AvgCalculator
 */


public class Main {
    public static void main(String[] args) {
        //Declare and initialize three integer variables to store numerical values. You may name the variables whatever you wish.

        int x = 4;
        int y = 5;
        int z = 6;


        //Create a fourth double variable named "avg" that stores the calculated average of those three number variables

        double avg = (x + y + z) / 3;



        //Print out the text "The average of the numbers x, y, and z is avg".

        System.out.printf("The average of the numbers %d, %d and %d is %.2f " , x,y,z,avg );


    }
}