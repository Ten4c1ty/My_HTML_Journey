import java.util.*;
public class MissingNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if((2 <= n) && (n <= 200000)){
            int z = (int)(n-1);
            long[] arr = new long [z];
            for(int a = 0; a < z; a++){
                arr[a] = sc.nextLong();
            }
            for(long b = 1; b <= n; b++){
                boolean flag = true;
                for(int c = 0; c < z; c++){
                    if(arr[c] == b){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(b);
                    break;
                }
            }
        }
        sc.close();
    }
}