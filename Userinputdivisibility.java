import java.util.Scanner;
    public class Userinputdivisibility{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you number: ");
        int number = sc.nextInt();
        if(number%5 == 0){
            if(number%7 == 0){
                System.out.println("Invalid:Divisible by both");
            }
            else{
                System.out.println("Divisible by 5 Only");
            }
        }
        else if(number%7 == 0){
            System.out.println("Divisible by 7 Only");
        }
        else{
            System.out.println("No");
        }
    }
}