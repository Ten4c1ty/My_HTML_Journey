import java.util.Scanner;
public class FibonacciInvestmentGrowth{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first N terms: ");
        int N = sc.nextInt();
        int first = 0;
        int second = 1;
        int sum = 0;
        System.out.print(first+"%, ");
        for(int i = 2; i <= N;i++){
            if( i == N){
            System.out.print(second+"%.");
            }
            else{
                System.out.print(second+"%, ");
            }
            sum = first + second;
            first = second;
            second = sum;
        }
    }
}