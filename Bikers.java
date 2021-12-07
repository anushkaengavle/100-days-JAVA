/*
Five Bikers Compete in a race such that they drive at
a constant speed which may or may not be the same as
the other. To qualify the race, the speed of a racer must
be more than the average speed of all 5 racers. Write a
Java program to take as input the speed of each racer
and print back the speed of qualifying racers
 */

public class Bikers{
    public static void main (String[] args)
    {
        float b1=20, b2=30, b3=40, b4=50, b5=60, average;
        average = (b1+b2+b3+b4+b5) /5;
        System.out.println("Average="+average);
        if (b1>average)
            System.out.println("b1 qualified");
        if (b2>average)
            System.out.println("b2 qualified");
        if (b3>average)
            System.out.println("b3 qualified");
        if (b4>average)
            System.out.println("b4 qualified");
        if (b5>average)
            System.out.println("b5 qualified");
        else
            System.out.println("Noone is qualified ");

    }
}

