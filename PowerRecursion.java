import java.util.Scanner;
public class PowerRecursion{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a base: ");
        int base = sc.nextInt();
        System.out.println("Please enter an exponent: ");
        int exponent = sc.nextInt();
        int x = power(base, exponent);
        System.out.println(x);
    }
    public static int power(int num1, int num2){
        if(num2 == 1)
            return num1;
        return num1*power(num1, num2-1);
    }
}