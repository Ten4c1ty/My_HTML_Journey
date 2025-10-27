import java.util.*;
public class IncreasingArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if((1 <= n) && (n <= 200000)){
        long arr[] = new long [(int)n];
        boolean flag = false;
        long a = 0;
        long b = 1;
        long min = 0;
        while(a < n){
            arr[(int)a] = sc.nextLong();
            if((arr[(int)a] <= Math.pow(10, 9)) && (arr[(int)a] >= 1)){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
            ++a;
        }
        if(flag == true){
        while(b < n){
            if(arr[(int)b] < arr[(int)(b-1)]){
                min = min + arr[(int)(b-1)] - arr[(int)(b)];
                arr[(int)b] = arr[(int)(b-1)];
                }
            ++b;
            }
        }
        System.out.println(min);
        }
        sc.close();
        }
    }