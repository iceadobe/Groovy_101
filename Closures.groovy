class Closures{
    static void main(String [] args)
    {
        def getFactorial = {num -> (num <= 1 ? 1 : num * call(num-1))}

        println(getFactorial(4));

        def greeting = "Goodbye";

        def closure1 = { theName -> println("$greeting $theName")}
        closure1("Sagar");

        def list = [1,2,3,4,5,6];
        list.each {println(it + 2)};

        def people = [
            'betta': 10,
            'betty': 20,
            'lauta': 33
        ];
        people.each {println("$it.key is $it.value years old")}

        println(list.find {it == 4});
        println(list.find {it == -1});
        println(list.findAll {it >=4 });
        println(list.any { it > 5 });
        println(list.every { it > 5 });

        println(list.collect {it * 2});
        println(list); //original list don't change

        def getEven = { it -> return(it % 2 == 0)}
        def evenNums = listEdit(list, getEven);
        println(evenNums);

        // find odd numbers between 1 and 100
        def all = 1..100;
        println( all.findAll({ it % 2 != 0}) );

    }

    static def listEdit(list, cond) {
        return list.findAll(cond);
    }
}