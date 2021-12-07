/*
    Write a menu driven Java program which will read
        a number and should implement the following
        methods
        1. factorial()
        2. testArmstrong()
        3. testPalindrome()
        4. testPrime()
        5. fibonacciSeries


 */

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        int i,f=1,r=0,sum = 0,rem, t= 0, n = 0, n1 = 0, n2 = 1, n3;
        boolean quit = false;
        System.out.println("Enter number :-");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();


        do {
            System.out.println("Enter 0.quit\n1.factorial \n2.Armstrong \n3.Palindrome \n4.prime \n5.fibonacci:-");

            int ch = in.nextInt();

            switch (ch) {

                case 1:
                    for (i = 1; i <= num; i++) {
                        f = f * i;

                    }
                    System.out.println("the factorial of number is :" + f);
                    break;

                case 2:

                    n = num;

                    while (n != 0) {
                        rem = n % 10;
                        r += Math.pow(rem,3) ;
                        n /= 10;
                    }

                    if (r == num)
                        System.out.println(num + " is an Armstrong number.");
                    else
                        System.out.println(num + " is not an Armstrong number.");
                    break;
                case 3:

                    n = num;
                    while (n > 0) {
                        r = n % 10;  //getting remainder
                        sum = (sum * 10) + r;
                        n = n / 10;
                    }
                    if (num == sum)
                        System.out.println("palindrome number ");
                    else
                        System.out.println("not palindrome");
                    break;

                case 4:

                    t= num;
                    n=0;
                    if (t == 0 || t == 1) {
                        System.out.println(t + " is not prime number");
                    } else {
                        for (i = 2; i < t/2; i++) {
                            if (t % i == 0) {
                                n = 1;
                                break;
                            }
                        }
                            if (n == 1)
                                System.out.println(num + " is not prime number");
                            else
                                System.out.println(num + " is prime number");


                    }
                    break;

                case 5:
                    System.out.print(n1 + " " + n2);

                    for (i = 2; i < num; ++i) {
                        n3 = n1 + n2;
                        System.out.print(" " + n3);
                        n1 = n2;
                        n2 = n3;
                    }

                    break;

                case 0:

                    quit = true;

                    break;

                default:

                    System.out.println("Wrong choice.");

                    break;
            }
        } while (!quit);
        System.out.println("Bye!");
    }
}



