package Function.Code;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);

        ans = sum3(20, 30);
        System.out.println(ans);
    }

    /*
     * return_type name (arguments) {
     * // body
     * return statement;
     * }
     * 
     */

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // return the value
    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        input.close();
        int sum = num1 + num2;
        return sum;
        // System.out.println("This will never execute");
    }

}
