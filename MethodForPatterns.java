import java.util.Scanner;
public class MethodForPatterns{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        showDots(number);
        show_palindrome(number);
        showDiamond(number);
    }
    public static void showDots(int num1){
        for(int i = 1; i <= num1; i++){
            System.out.print(".");
        }
    }
    public static void show_palindrome(int num2){
        for(int j = 1; j <= num2; j++){
            System.out.print(j);
        }
        for(int k = num2-1; k > 0; k--){
            System.out.print(k);
        }
    }
    public static void showDiamond(int num3){
        for(int m = 1; m <= num3; m++){
            System.out.println();
            showDots(num3-m);
            show_palindrome(m);
            showDots(num3-m);
        }
        for(int j = num3-1; j > 0; j--){
            System.out.println();
            showDots(num3-j);
            show_palindrome(j);
            showDots(num3-j);
        }
    }
}