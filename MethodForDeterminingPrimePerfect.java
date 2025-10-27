import java.util.Scanner;
public class MethodForDeterminingPrimePerfect{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int prime = sc.nextInt();
        boolean check1 = isPrime(prime);
        System.out.println(check1);
        boolean check2 = isPerfect(prime);
        System.out.println(check2);
        int result = special_sum(prime);
        System.out.println(result);
    }
    public static boolean isPrime(int num1){
        boolean flag = true;
        for(int i = 2; i < num1; i++){
            if(num1%i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isPerfect(int num2){
        int sum1 = 0;
        for(int i = 1; i < num2; i++){
            if(num2%i == 0){
                sum1 += i;
            }
        }
        if(sum1 == num2){
            return true;
        }
        else{
            return false;
        }
    }
    public static int special_sum(int num3){
        int sum2 = 0;
        for(int j = 2; j < num3; j++){
            if(isPrime(j)){
                sum2 += j;
            }
            else if(isPerfect(j)){
                sum2 += j;
            }
        }
        return sum2;
    }
}