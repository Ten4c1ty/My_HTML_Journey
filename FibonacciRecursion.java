import java.util.Scanner;
public class FibonacciRecursion{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the last term of the fibonacci sequence: ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int num){
        if(num == 0)
            return 0;
        if(num == 1)
            return 1;
        return fibonacci(num-1)+fibonacci(num-2);
    }
}