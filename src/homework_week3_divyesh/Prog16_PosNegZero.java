package homework_week3_divyesh;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class Prog16_PosNegZero {
    static int num;
    public static void main(String []s) {
        number();
    }



    public static void number(){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        num=sc.nextInt();


        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println("IT's ZERO.");

    }
}
