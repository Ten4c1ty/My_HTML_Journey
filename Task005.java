import java.util.Scanner;
    public class Task005{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();
        System.out.println("Armstrong numbers: ");
        for(int num = start; num<=end; num++){
            int sum = 0;
            int digit = 0;
            int num1 = num;
            while(num1 != 0){
                digit++;
                num1 = num1/10;
            }
            int num2 = num;
            while(num2!=0){
            int num3 = num2%10;
            int power = 1;
            for(int i = 1; i<=digit; i++ ){
                power *= num3;
            }
            sum += power;
            num2 = num2/10;
            }
            if(sum == num){
                System.out.println(num);
            }
        }
    }
}