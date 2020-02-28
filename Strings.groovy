class Strings {
    static void main(String []args) {
        def name = "Derek";

        // println('I an ${name}\n');
        // println("I am $name\n");

        def multString = """I am string
        a new line in that string 
        Let's see third line."""
        println(multString);

        println("3rd index " + name[3]);
        println("indexOf(r) " + name.indexOf('r'));

        //slices
        println("1st 3 chars of name: " + name[0..2]);

        println("0,2,4th char: " + name[0,2,4]);

        println("My name " + name );
        println("My name ".concat(name));

        println("Derek == Derek: " +("Derek".equals("Derek")));

        println("Hello.length(): " + "Hello".length());

        println("Trying multiplying string " * 2);
        println("Hello World - Hello: '" + ("Hello World" - "Hello") + "'");
        // compare
        println("Ant <=> Banana: " + ("Ant" <=> "Banana"));
        println("Ant <=> Ant: " + ("Ant" <=> "Ant"));
        println("Banana <=> Ant: " + ("Banana" <=> "Ant"));


    }
}