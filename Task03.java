import java.util.Scanner;
public class Task03{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int integer = sc.nextInt();
        int nonnegative = 0;
        int negative = 0;
        for(int i=1; i<=integer; i++){
            System.out.println("Please enter number "+i+": ");
            int number = sc.nextInt();
            if(number >= 0){
                nonnegative++;
            }
            else if(number < 0){
                negative++;
            }
        }
        System.out.println(nonnegative+" Non-negative Numbers");
        System.out.println(negative+" Negative Numbers");
    }
}