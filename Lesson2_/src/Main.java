public class Main {
    public static void main(String[] args) {

       //declaration int x
       //initialization x=5
       int x = 5;

       //value - literal;

        //identifier(another name for int) text
        String text ="whatever we want goes here";


        int y;
        String name;

        //Primitive Variable types in Java

        int y = 5;
        double pi = 3.1459;
        //char c = "marks pizzaria"; // ' ' are for chars, " " are for strings
        boolean b = true; //stores true and false values


        //byte -> short ->int -> long
        byte by;
        short s;
        long l;

        //float -> double (decimals)
        float f;

        //what is a non-primitive variable (wrapper)


        String name2;
        Integer N;
        Double vv;


        //Primitive variables are orange
        //Non-Primitive always start uppercase

       int z = 5 + 5;
        z = 10 / 3;

        double g = (double) 10 / 3;
        int Myint = 9;

        double d = Myint; //Automatic casting: int to double

        //widening (Automatic Casting) int -> double

        int myInt = 10;
        double d = myInt; //Automatic Casting: int to double

        System.out.print(d);

        //Narrowing (Manual Casting) double -> int

        double myDouble = 9.78;

        int myIntz = (int) myDouble;  //Manual Casting: double to int

        System.out.print(myIntz);

        //Widening and

        double G = (double) 10 /3;
        System.out.print(g);

        //Math Library

        int max = Math.max(x, y);
        int min = Math.min(10, 3);
        double rng = Math.random();
        int random = (int) rng * 100;

        System.out.println(rng);
        System.out.println(random);

        //PEMDAS applies

        double equation = (x + y) / z;

        //Print Format Methods

        System.out.println("the result of the equation is" + equation);
        System.out.printf("the result of the equation is %.2f", equation);
        //%.2f= %(tells there will be a variable in this location), (.2f) 2 levels of precision

        //Pass in multiple variables with print f

        double a = 3.33;
        double v = 8.32;

        System.out.printf("the sum of %.2f and %.2f is %.2f", a,v,sum);

        //pass in integers - %d
        System.out.println


    }
}