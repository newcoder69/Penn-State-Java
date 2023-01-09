/**
 * Gabriel Mazza
 * gkm5395
 * IST 140 - Final - Programming Assignment
 */



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //saves user inputted number of years
        int numOfyears = getNumOfYears();
        //generates the data for the earthquakes for a given amount of years
        int[] yearlyQuakes = generateQuakedata(numOfyears);

        //calls the writeQuakedata method
        writeQuakedata(yearlyQuakes);

        //saves the populated Arraylist with the quake data
        ArrayList<Integer> quakeData = readQuakeData();

        //calls the printAnalysis method
        printAnalysis(quakeData);

    }


    //This method prompts the user to enter the number of years that the program will look at
    private static int getNumOfYears() throws Exception {
        //creates a new scanner
        Scanner scan = new Scanner(System.in);
        int numOfyears = 0;
        try {
            //prompts the user to enter a number of years
            System.out.println("Enter the number of years to evaluate seismic data (1-20 inclusive)");
            numOfyears = scan.nextInt();
           //to catch an input that is below 1 or above 20
            if(numOfyears < 1 || numOfyears > 20){
                throw new Exception("Invalid number");
            }
        } catch(InputMismatchException e){
            //prints error message if user inputted an invalid amount of years
            System.err.println("You have entered an invalid number of years");
        }
        return numOfyears;
    }


    //Generate Quake data method returns an array of integers and uses the number of years as a parameter
    private static int[] generateQuakedata(int numOfyears){
        //declare an int array with a max size based on numOfYears and populate the array using a randomly generated number between 0 and 8 inclusive.
    int[] generateData = new int[numOfyears];
        for (int i = 0; i < generateData.length; i++) {
            //populate the array with numbers 1-8 based on the data given from numOfyears
            generateData[i] = (numOfyears) = (int) (Math.random() * 9);

        }
        //returns the data of the array
        return generateData;
    }

    //This method writes the array data to the quakes.txt file
    private static void writeQuakedata(int[] yearlyQuakes){
        String fileName = "quakes.txt";
        try{
            //creates a new PrintWriter to actually write to the file
            PrintWriter pw = new PrintWriter("quakes.txt");
            for (int i = 0; i <yearlyQuakes.length ; i++) {
                pw.println(yearlyQuakes[i]);
            }
            pw.close();
            //if the file cant be written to, return an error
        } catch (FileNotFoundException fne){
            System.err.println("There was an error in writing to the file");
        }
    }

    //This method reads from the quakes.txt file and adds the data from said file into an arraylist and returns that arraylist
    private static ArrayList<Integer> readQuakeData() {


        ArrayList<Integer> quakeData = new ArrayList<>(20);
        try {
            File myFile = new File("quakes.txt");
            Scanner scan = new Scanner(myFile);
            //while the scanner has a line to scan from the file, it adds that number to the array list
            while (scan.hasNextInt()) {
                quakeData.add(scan.nextInt());
            }
            scan.close();
            //returns an error if the file cannot be read
        } catch (FileNotFoundException fne) {
            System.err.println("There was an error in reading the file");
            fne.printStackTrace();
        }
        //returns the populated Arraylist Data
        return quakeData;
    }


    //this method prints the final analysis of the data
    private static void printAnalysis(ArrayList<Integer> quakeData){
        //prints how the strength of the quakes in a given amount of years
            int firstyear = quakeData.get(0);
            System.out.printf("Yearly Quakes:" + quakeData);


        String severity = "";
        //determines the strength of the quake using the richter scale
        if(firstyear <= 2 ){
            severity = "MINOR";
        }
        if (firstyear <= 5 && firstyear >= 3){
            severity = "MEDIUM";
        }
        if (firstyear <= 8 && firstyear >= 5){
            severity = "MAJOR";
        }


        System.out.printf("\n" + "this year saw a %s quake with a strength of %d ", severity, quakeData.get(0));
    }
}
