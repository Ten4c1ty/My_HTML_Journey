import java.util.*;
public class Twins{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if((1 <= n) && (n <= 100)){
            long arr[] = new long [(int)n];
            long minimum = 0;
            boolean flag = false;
            long a = 0;
            long sum = 0;
            long sum2 = 0;
            long b = n;
            long c = 0;
            while(a < n){
                arr[(int)a] = sc.nextLong();
                sum += arr[(int)a];
                if((1 <= arr[(int)a]) && (arr[(int)a] <= 100)){
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }
                ++a;
            }
            while(c < (n-1)){
                long d = 0;
                while(d < (n-c-1)){
                    if(arr[(int)d] < arr[(int)c]){
                        long temp = arr[(int)d];
                        arr[(int)d] = arr[(int)d+1];
                        arr[(int)d+1] = temp;
                    }
                    d++;
                }
                c++;
            }
            if(flag == true){
            while(--b >= 0){ 
                sum2 += arr[(int)b];
                if((sum/2) >= sum2){
                    minimum++;
                }
                else{
                    minimum++;
                    System.out.println(minimum);
                    break;
                }
            }
            }
        }
        sc.close();
    }
}