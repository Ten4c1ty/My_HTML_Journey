import java.util.Scanner;

public class Task010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers:");

        for (int num = start; num <= end; num++) {
            int temp = num;
            int digitCount = 0;

            // Count digits
            int n = temp;
            while (n != 0) {
                digitCount++;
                n /= 10;
            }

            // Reset variables
            int sum = 0;
            temp = num;

            // Compute Armstrong sum
            while (temp != 0) {
                int digit = temp % 10;

                // Calculate digit ^ digitCount using loop
                int power = 1;
                for (int i = 0; i < digitCount; i++) {
                    power *= digit;
                }

                sum += power;
                temp /= 10;
            }

            // Check Armstrong condition
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
