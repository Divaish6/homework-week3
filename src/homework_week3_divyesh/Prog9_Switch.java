package homework_week3_divyesh;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */

public class Prog9_Switch {
    public static void main(String[] args) {
        switch1();
    }
        public static void switch1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A TO F");
        char city = sc.next().charAt(0);

        switch (city){
            case 'A':
                System.out.println("City name is : Amsterdam");
                break;
            case 'B':
                System.out.println(" City name is : Berlin");
                break;
            case 'C':
                System.out.println("City name is : Cairo");
                break;
            case 'D':
                System.out.println("City name is : Dublin");
                break;
            case 'E':
                System.out.println(" City name is : Edinburgh");
                break;
            case 'F':
                System.out.println(" City name is : Florida");
                break;
            default:
                System.out.println("Invalid data");

        }
    }


}
