package homework_week3_divyesh;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Prog10_Calculate {
    public static void main(String[] args) {

        twonumber();
    }
    public static void twonumber(){
        Scanner sc = new Scanner(System.in);


        System.out.print(
                "Enter the first and the Second number - ");
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.print(
                "Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
        char op = sc.next().charAt(0);
        solve(a, b, op);
    }
    public static int solve(int a, int b, char op)
    {
        int ans = 0;

        if (op == '+') {
            ans = a + b;

        }
        else if (op == '-') {
            ans = a - b;

        }
        else if (op == '*') {
            ans = a * b;

        }
        else if (op == '%') {
            ans = a % b;

        }
        else if (op == '/') {
            ans = a / b;
        }


        System.out.println("Your answer is - " + ans);
        return ans;
    }
}
