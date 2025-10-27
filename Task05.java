import java.util.Scanner;
public class Task05{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int a = 0;
        int b = 0;
        while(i<=10){
            System.out.println("Enter Number: ");
            int number = sc.nextInt();
            i++;
            a=number;
            b=a+b;
            System.out.println("Sum = "+b);
        }
    }
}