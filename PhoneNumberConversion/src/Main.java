
/**
 * Gabriel Mazza
 * gkm5395
 * IST 140-PhoneNumberConversion
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Use a scanner object to capture the 10 digit string from the command window. Store this string as raw_number.
            Scanner phone = new Scanner(System.in);
        System.out.println("Enter a 10 digit phone number");

        String raw_number = phone.next();

        //Take the substring of the first three characters of raw_number and add parenthesis on either side and store this string as area code.

            raw_number.substring(0,3);

            String area_code = ("(" + raw_number.substring(0,3) + ") ");


        //Define a string variable: local_number by using a combination of substrings of the raw_number and inserting a hyphen in the middle

        String local_number = raw_number.substring(3,6) + "-" + raw_number.substring(6);


        //Define a string variable formatted_number that is the concatenation of the area_code and local_number variables.
                String formatted_number = area_code.concat(local_number);

        System.out.println(formatted_number);






    }
}