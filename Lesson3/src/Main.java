public class Main {
    public static void main(String[] args) {
        //Non primitive variable

        String phrase = "Hello World";

        //primitive char
        char c = '9';
        //non-primitive char class

        Character d;
        // Character Methods that return true or false(aka Boolean)
        Boolean b = Character.isLowerCase(c);
        b = Character.isLowerCase(c);

        //Non-Primitive variable, "string of characters"
        String Phrase = "Hello World";
        //Using self assingnment to convert a string to upper or lower case

        Phrase = phrase.toUpperCase();

        int length = phrase.length(); //this shows the length of the string

        phrase = phrase.trim(); //removes extra white space in front and end

        System.out.println(phrase);
        System.out.println(length);


        //pull out a character

        char w = phrase.charAt(6);

        System.out.println(w);






    }
}