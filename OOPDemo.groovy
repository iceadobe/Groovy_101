class OOPDemo {
    static main(args) {
        // Uses Construcutor
        def king = new Animal('King', 'Growl');
        
        println("$king.name says $king.sound");
        // Setters are automatically created
        king.setSound("Grrrrrr");
        println("$king.name says $king.sound");


        king.run();        
        println(king.toString());

        // Inheritance
        def tommy = new Dog('Tommy','Grrr','Sagar');
        println(tommy.toString());
        tommy.makeSound();
    }
}