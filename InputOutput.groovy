class InputOutput {
    static void main(String []args) {
        def randString = "Random";

        println("A $randString string");
        printf("A %s string\n", randString);
        
        printf("%-10s %d %.2f %10s \n", ['Stuff', 10, 1.245, 'Random']);

        println('What\'s your Name ? ');
        def fName = System.console().readLine();
        println("Hello $fName");

        println("Enter a Number: ");
        def num1 = System.console().readLine().toDouble();
        println("Enter a Number: ");
        def num2 = System.console().readLine().toDouble();

        printf("%.2f + %.2f = %.2f\n", [num1, num2, (num1+num2)]);
        
    }
}