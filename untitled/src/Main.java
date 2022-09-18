import java.util.Locale;

/**
 * Gabriel Mazza
 * gkm5395
 * IST 140 - String Length
 */


public class Main {
    public static void main(String[] args) {

        //Declare and initialize 2 String variables


        String yum = "fried chicken";
        String yuk = "mushrooms ";

        //Use the .toUppercase() method on yum variable to convert the text to all UPPERCASE.
        yum = yum.toUpperCase();

        //Use the .toLowercase() method on yuck variable to convert the text to all lowercase.
        yuk = yuk.toLowerCase();

        // manual concatination to combine strings

        String yukyum = yuk + yum;

        int length = yukyum.length();

        System.out.print("I have created a new food " + yukyum + "that is " + length + " characters long.");





    }
}