import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Use a Scanner to capture the following variables:

        Scanner scan = new Scanner(System.in);
        //The total book price (a double)
        System.out.println("what is the total price of your books?");

        double TotalPrice = scan.nextDouble();

        //The number of books (an integer).
        System.out.println("How many books do you have ");

        double TotalBooks = (double)scan.nextInt();

        //Create a tax variable that is 7.5 percent of the total book price
        double tax = TotalPrice * 0.075;

        //Create a shipping variable that computes the shipping charge of $2 per book.
        double shipping = TotalBooks * 2.0;

        //Create a total price variable which stores the sum of the total book price, the tax, and the shipping.
        double completeprice = tax + TotalPrice + shipping;

        //Use the printf command, replacing all XX.XX and N values with actual values in the output below:
        //"Your original order of $XX.XX dollars for N books comes out to $XX.XX total with $XX.XX tax and $XX.XX shipping"
        System.out.printf("Your Original order of $%.2f dollars for %.2f books comes out to $%.2f tax and $%.2f shipping.", TotalPrice, TotalBooks, tax, shipping);


    }
}