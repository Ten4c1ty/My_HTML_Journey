import java.util.*;
public class WeirdAlgorithm{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if((1 <= n) && (n <= Math.pow(10, 6))){
            long a = n;
            System.out.print(a+" ");
            while(a > 1){
                if(a%2 == 0){
                    a = a/2;
                    System.out.print(a + " ");
                }
                else{
                    a = ((a*3)+1);
                    System.out.print(a + " ");
                }
            }
        }
        sc.close();
    }
}