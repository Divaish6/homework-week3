package homework_week3_divyesh;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class Prog11_DivideSep {

    public static void main(String args[]) {

        cal ();

        calc ();
    }
        public static void cal () {
            System.out.println("Divided by 3: ");
            for (int i = 1; i < 100; i++) {
                if (i % 3 == 0)
                    System.out.print(i + ", ");
            }
        }
        public static void calc () {
            System.out.println("Divided by 5: ");
            for (int i = 1; i < 100; i++) {
                if (i % 5 == 0) System.out.print(i + ", ");
            }

        }
    }

