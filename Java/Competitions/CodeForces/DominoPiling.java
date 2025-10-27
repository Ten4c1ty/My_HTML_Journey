import java.util.*;
public class DominoPiling{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long M = sc.nextLong();
        long N = sc.nextLong();
        if((1 <= M) && (M <= N) && (N <= 16)){
            long aread =2;
            long areab = M*N;
            long max  = 0;
            while(areab > 1){
                areab -= aread;
                max++;
            }
            System.out.println(max);
        }
        sc.close();
    }
}