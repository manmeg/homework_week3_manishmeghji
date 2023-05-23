package homework_week3_manishmeghji;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class programme6
{
    public static void main(String[] args) {

        input();
    }

        public static void input () {
            Scanner reader = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = reader.nextInt();

            String evenOdd = (num % 2 == 0) ? "even" : "odd";

            System.out.println(num + " is " + evenOdd);
        }

}
