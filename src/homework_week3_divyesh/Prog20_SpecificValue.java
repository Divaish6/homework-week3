package homework_week3_divyesh;

/**
 *Write a Java program to test if an array contains a specific value.
 */

public class Prog20_SpecificValue {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] my_array1 = {
                89, 20, 18, 14,
                56, 22, 14, 24};
        System.out.println(contains(my_array1, 20));
        System.out.println(contains(my_array1, 57));
    }
}
