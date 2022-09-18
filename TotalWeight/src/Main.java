public class Main {
    public static void main(String[] args) {

        /**
         * I have 8 friends that want to drink 4 beers
         * Each 6 pack of beer costs 8.99
         * my bank account is $20
         *
         */

        /**
         * how many 6 packs do I need to buy for my friends?
         */
        int numOfFriends = 8;
        int numOfBeers = 4;


         //totalbeer is equal to numOfFriends(8) times numOfBeers(4)
        int totalBeer = numOfFriends * numOfBeers;
         //Numof6Packs(5.3333) is equal to totalbeer(32) divide by 6
        int numOf6Packs = totalBeer / 6;


         //Total6Packs = round up the Numof6Packs
    }
}