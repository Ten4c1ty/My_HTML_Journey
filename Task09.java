import java.util.Scanner;
public class Task09{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        boolean prime = false;
        for(int i =2; i<=number ; i++){
            if (number%i == 0){
                prime = false;
                break;
            }
        }
        int sum = 0;
        for(int i = 1; i<number; i++){
            if (number%i == 0){
                sum += i;
            }
        }
        if(prime){
        System.out.println(number + " is a prime number");
        }
        else{
        System.out.println(number + " is not a prime number");
        }
        if(sum == number){
        System.out.println(number + " is a perfect number");
        }
        else{
        System.out.println(number + " is not a perfect number");
        }
    }
}