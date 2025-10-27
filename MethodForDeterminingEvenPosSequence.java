import java.util.Scanner;
public class MethodForDeterminingEvenPosSequence{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int even = sc.nextInt();
        evenChecker(even);
        boolean result1 = isEven(even);
        System.out.println(result1);
        boolean result2 = isPos(even);
        System.out.println(result2);
        sequence(even);
    }
    public static void evenChecker(int num1){
        if(num1%2 == 0){
            System.out.println("Even!!");
        }
        else{
            System.out.println("Odd!!");
        }
    }
    public static boolean isEven(int num2){
        if(num2%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isPos(int num3){
        if(num3 >= 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void sequence(int n){
        if(isPos(n)){
            for(int i = 0; i <= n; i++){
                if(isEven(i)){
                    System.out.print(i+" ");
                }
            }
        }
        else{
            for(int i = n; i < 0; i++){
                if(!isEven(i)){
                    System.out.print(i+" ");
                }
            }
        }
    }
}