import java.util.Scanner;
public class Palindromef{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your last digit to print: ");
        int lastDigit = sc.nextInt();
        for(int i = 1; i<=lastDigit;i++){
            System.out.print(i);
        }
        for(int k = lastDigit-1; k>0;k--){
            System.out.print(k);
        }
    }
}