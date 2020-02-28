class Functions{
    static void main(String []args)
    {
        sayHello();

        println(defaultParam());
        println(defaultParam(1));
        println(defaultParam(2,3));

        def name = "Himalaya";
        passByValue(name);
        println(name);

        println(doubleList([1,2,3,4,5]));
        println(varParam(1,23,4,5,9));
    }
    static def sayHello() {
        println("Hello");
    } 
    static def defaultParam(num1=9, num2=7) {
        return num1 + num2;
    }
    static def passByValue(name) {
        name = "In Function";
        println(name);
    }
    static def doubleList(list) {
        return list.collect { it * 2};
    }
    static def varParam(...nums) {
        def sum = 0;
        nums.each { sum += it; }
        return sum;
    }
    
}