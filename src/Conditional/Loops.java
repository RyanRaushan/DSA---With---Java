package Conditional;
public class Loops {
    public static void main(String[] args) {

        /*
         * Syntax of for loops:
         * 
         * for (initialisation; condition; increment/decrement) {
         * // body
         * }
         */

        for (int num = 1; num <= 5; num += 2) {
            System.out.println(num);
        }

        // while loops
        /*
         * Syntax:
         * while (condition) {
         * // body
         * }
         */

        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num += 1;
        }

        // do while
        /*
         * do {
         * // body
         * } while (condition);
         * 
         */
        int n = 1;
        do {
            System.out.println("Hello World");
        } while (n != 1);

    }
}
