package homework_week3_divyesh;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Prog17_ArrStrArray {
    public static void main(String[] args){

        Number();
    }

    public static void Number(){
        int[] my_array1 = {
                89, 20, 18, 14, 213,
                 58, 54, };

        String[] my_array2 = {
                "DIU",
                "CITY",
                "MUMBAI",
                "DELHI",

        };
        System.out.println("Original numeric array : "+Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));

        System.out.println("Original string array : "+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : "+ Arrays.toString(my_array2));
    }
}
