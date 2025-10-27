import java.util.Scanner;
public class Task07{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        while(number!=0){
            System.out.print(number%10);
            number = number/10;
            if(number != 0){
                System.out.print(", ");
            }
        }
    }
}