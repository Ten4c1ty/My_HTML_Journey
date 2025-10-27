import java.util.Scanner;
public class Palindromew{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your last digit to print: ");
        int lastDigit = sc.nextInt();
        int i = 1;
        while(i<=lastDigit){
            System.out.print(i);
            i++;
        }
        int k = lastDigit-1;
        while(k>0){
            System.out.print(k);
            k--;
        }
    }
}