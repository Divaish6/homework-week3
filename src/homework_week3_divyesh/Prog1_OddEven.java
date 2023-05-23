package homework_week3_divyesh;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */

public class Prog1_OddEven {
    public static void main(String[] args) {

        Number();
    }
    public static void Number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to test");
        int number = sc.nextInt();
        sc.close();
        //ternary operator to check number
        String result = number%2==0 ? "Even" : "Odd";
        System.out.println(number +" is "+ result);

    }
}
