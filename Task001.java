import java.util.Scanner;
    public class Task001{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of test cases: ");
        int N = sc.nextInt();
        int cases = 1;
        while(cases <= N){
        System.out.println("Please enter the starting number: ");
        int X = sc.nextInt();
        System.out.println("Please enter the number of odd numbers: ");
        int Y = sc.nextInt();
        int sum = 0;
        int count =1;
        while(count<=Y){
            int i = 2;
            if( X%i==1){
                sum =sum+X;
                count++;
            }
            X++;
        }
        System.out.println(sum);
        cases++;
        }
    }
}