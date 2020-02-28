package iceadobe.learning.groovy;

class Types {
    static void main(String []args) {
        
        // defining Variables
        def age = "Hello World";
        age = 10

        // Arithmetic Operations
        println(" " + (5 + 4));
        println(" " + (5 - 4));
        println(" " + (5 * 4));
        println(" " + (5 / 4));
        println(" " + (5.intdiv(4)));
        println(" " + (5 % 4));

        // FLoating Artihmetic
        println(" " + (5.2.plus(4.9)));
        println(" " + (5.2.minus(4.9)));
        println(" " + (5.2.multiply(4.9)));
        println(" " + (5.2 / 4.9));

        // Increement and Decreement are same

        println("Biggest Int: " + Integer.MAX_VALUE);
        println("Smallest Int: " + Integer.MIN_VALUE);
        //same goes for Float, Double


        def randNum = 2.0;
        println("Math.abs(-2.45) = " + Math.abs(-2.45));
        println("Math.round(-2.45) = " + Math.round(-2.45));
        println("randNum.pow(3) = " + randNum.pow(3));
        
        println(3.0.equals(2.0));
        println(randNum.equals(Float.NaN));
        println(Math.sqrt(9));
        println(Math.cbrt(27));
        Math.ceil(2.45);
        Math.floor(2.45);
    }

}