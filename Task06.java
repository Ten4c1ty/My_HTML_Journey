import java.util.Scanner;
public class Task06{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        System.out.println("Divisors of "+number+" : ");
        for(int i =1; i <= number ; i++){
            if(number%i == 0){
                System.out.println(i);
            }
        }
    }
}