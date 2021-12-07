

import java.util.Scanner;

/*
Write a Menu driven program in java to implement simple banking applications.
Application should read the customer name, account number, initial balance,
rate of interest, contact number and address field etc.

Application should have following methods.

1. createAccount()
2. deposit()
3. withdraw()
4. computeInterest()
5. displayBalance()

 */
public class Bankingsystem {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int ch;


        boolean quit = false;

        float balance = 0;

        do {

            System.out.println("0. Exit\n1. Create Account\n2. Deposit money\n3. Withdraw money\n4. Compute Interest\n5. check balance");

            ch = in.nextInt();


            switch (ch) {
                case 1:
                    System.out.println("Enter your user ID");
                    int Id = in.nextInt();
                    System.out.println("Enter password");
                    int password = in.nextInt();
                    System.out.println("Enter balance");
                    balance = in.nextInt();
                    break;
                case 2:

                    float amount;

                    System.out.print("Amount to deposit: ");

                    amount = in.nextFloat();

                    balance += amount;

                    break;

                case 3:

                    System.out.print("Amount to withdraw: ");

                    amount = in.nextFloat();

                    balance -= amount;

                    break;


                case 4:

                    double r = 1.5;
                    System.out.println("Enter Time");
                    float t = in.nextFloat();

                    double s = (balance * r * t) / 100;

                    System.out.println("Simple Interest is: " + s);
                    break;

                case 5:

                    System.out.println("Your balance: Rs" + balance);

                    break;

                case 0:

                    quit = true;

                    break;

                default:

                    System.out.println("Invalid......Select again ");

                    break;

            }

            System.out.println();

        } while (!quit);

        System.out.println("**************Exited******************");

    }

}