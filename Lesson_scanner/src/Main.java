import java.util.Scanner; //<- importing the scanner class into your program

public class Main {
    public static void main(String[] args) {


        //Class scanner variable_name = new instance of the scanner class
        Scanner scan = new Scanner(System.in);



        //prompt the user before collecting data
        System.out.println("Please Enter a Number");
        int x = scan.nextInt();


        //Example oft Capturing a Decimal
        System.out.println("Please enter a Decimal Number: ");
        double y = scan.nextDouble();

        //Example of capturing strings
        System.out.println("Please Enter Text");
        String s = scan.next();
        String

        System.out.println("User entered: " + s );











    }
}