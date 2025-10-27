import java.util.Scanner;
public class Task04{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int number = sc.nextInt();
        int sum = 0;
        int odd = 1;
        System.out.println("The odd numbers are: ");
        for (int i = 1; i <= number; i++){
            sum+=odd;
            System.out.println(odd);
            odd+=2;
        }
        System.out.println("The Sum of odd Natural Numbers up to "+number+" terms is: "+sum);
    }
}