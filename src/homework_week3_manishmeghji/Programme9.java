package homework_week3_manishmeghji;

/**
 * Same as above program-8 using switch statement.
 */

import java.util.Scanner;

public class Programme9
{
    public void cityName(String alphabet) {
        switch (alphabet) {
            case "A":
                System.out.println("City name is Amsterdam");
                break;
            case "B":
                System.out.println(" City name is : Bristol");
                break;
            case "C":
                System.out.println("City name is : Chicago");
                break;
            case "D":
                System.out.println("City name is : Diu");
                break;
            case "E":
                System.out.println(" City name is : Edinburgh");
                break;
            case "F":
                System.out.println(" City name is : Florida");
                break;
            default:
                System.out.println("Invalid data");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any one alphabet from A to F");
        String name = sc.nextLine();
        Programme9 obj = new Programme9();
        obj.cityName(name);
    }

}
