import groovy.transform.ToString;

@ToString(includeNames=true, includeFields=true)
class Animal{
    def name;
    def sound;

    def Animal(name, sound){
        println("Constructor: Animal");
        this.name = name; this.sound = sound;
    }

    def run(){
        println("$name is running");
    }

    def makeSound(){
        println("$name says $sound");
    }
}