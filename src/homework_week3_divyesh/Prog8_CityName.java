package homework_week3_divyesh;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Prog8_CityName {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet from A to F : ");
        String city = sc.nextLine();
        name(city);
    }
    public static void name(String name){
        if (name.equals("A")){
            System.out.println(" City name is : Amsterdam");
        }else if (name.equals("B")){
            System.out.println(" City name is : Berlin");
        } else if (name.equals("C")) {
            System.out.println(" City name is : Cairo");
        } else if (name.equals("D")) {
            System.out.println(" City name is : Dublin" );
        } else if (name.equals("E")) {
            System.out.println(" City name is : Edinburgh");
        } else if (name.equals("F")) {
            System.out.println(" City name is : Florida");
        }else {
            System.out.println(" Any other alphabet should be invalid ");
        }
    }


}
