class Branching{
    static void main(String []args)
    {
        def age = 90;
        if(age == 5) {
            println("Go to KG");
        }
        else if (age > 5 && age < 18){
            println("Go to grade: " + (age - 5));
        }
        else {
            println("Go to college");
        }

        println( true ? "Yes": "No");
        println( false ? "Yes": "No");

        switch(age)
        {
            case 16: println("Driving allowed");
            case 18: println("Voting allowed");
            break;
            default: println("Have fun");
        }

        age = 12;
        switch(age)
        {
            case 1..6: println("Child"); break;
            case 7..12: println("Boy"); break;
            case 13..19: println("Teenager"); break;
        }

        def i =0;
        while(i<=10)
        {
            if(i % 2)
            {
                i++; continue;
            }
            if(i == 8) break;
            println(i);
            i++
        }

        for(i = 0; i< 5; i++){
            println(i);
        }

        for(j in 2..6){
            print(j+ " ");
        }
        println();
        def custs = [
            100: "helly",
            101: "kelly",
            102: "sally"
        ]
        for(cust in custs)
        println(cust);
    }
}