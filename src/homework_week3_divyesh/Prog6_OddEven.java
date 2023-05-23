package homework_week3_divyesh;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */

public class Prog6_OddEven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = reader.nextInt();
        input(N);
    }

    public static void input(int N) {


        if (N % 2 == 0){
            System.out.println(N + "   Number is an even number");
        }else {
            System.out.println(N + "   Number is an odd number");
        }
    }
}
