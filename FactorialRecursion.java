import java.util.Scanner;
public class FactorialRecursion{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();
        int x = factorial(n);
        System.out.println(x);
    }
    public static int factorial(int num){
        if(num == 1)
            return num;
        return num*factorial(num-1);
    }
}