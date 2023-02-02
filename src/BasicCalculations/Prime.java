package BasicCalculations;

import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        input.close();
        if(n <= 1) {
            System.out.println("Neither prime nor composite");
            return;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("Not Prime");
                return;
            }
            c = c + 1;
            // c++;
        }
        if (c * c > n) {
            System.out.println("Prime");
        }
    }
}
