package homework_week3_divyesh;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Prog12_AlphabetSym {
    public static void main(String[] args) {
        input();

    }
    public static void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input value : ");
        char ch = scanner.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is A ALPHABET.");

        } else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + " is A NUMBER.");

        } else {

            System.out.println(ch + " is A SYMBOL.");
        }

    }
}
