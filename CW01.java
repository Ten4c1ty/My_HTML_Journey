import java.util.*;
public class CW01{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long a = 10;
        long sum = 0;
        long odd = 0;
        long max = 0;
        long min = 9999999;
        double avg = 0;
        long even = 0;
        while(--a >= 0){
            long b = sc.nextLong();
            if((b%2 != 0) && (b > 0)){
                sum+=b;
                odd++;
                if(b < min){
                    min = b;
                }
                if(b > max){
                    max = b;
                }
                if(a == 0){
                    avg = (double)sum/odd;
                    System.out.println("The sum is "+sum);
                    System.out.println("The minimum is "+min+ " .");
                    System.out.println("The maximum is "+max+" .");
                    System.out.println("The average is "+avg+" .");
                }
            }
            else{
                even++;
            }
        }
        if(even == 10){
            System.out.println("No odd positive numbers found.");
        }
    }
}