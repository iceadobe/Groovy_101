class ListEx {
    static void main(String []args) 
    {
        def list1 = [2,34,5,5,6,89,32];
        def list2 = ['Hello', 123, 'World', false, 123.231];
        println(list1);
        println(list2);

        // Get elements
        println(list1.get(0));
        println(list2[list2.size() - 1]);

        // Common List Methods
        println(list1.intersect([1,23,34]));
        println(list2.reverse());
        println(list1.sort());
        println(list2.pop());
        
        // Operations
        println(list1 - [2,34,5]); // both the 5s from list1 are removed
        println(list2 + ['john', 'fucking' + 'doe']);

    }
}