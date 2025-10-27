import java.util.*;
public class Permutations{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n;
        long b = 0;
        boolean flag = true;
        long arr[] = new long [(int)n];
        if(n < 4){
            flag = false;
        }
        if(flag == true){
        if((1 <= n) && (n <= Math.pow(10, 6))){
            if(n%2 == 0){
                while(--a >= 0){
                    if(((n/2)-1) == a){
                        arr[(int)a] = n;
                    }
                    else if(a == 0){
                        arr[(int)(n/2)] = 1;
                    }
                    else if(a%2 == 0){
                        arr[(int)(n-2)] = a;
                    }
                    else{
                        arr[(int)a] = a;
                    }
                }
            }
            else{
                while(a > 0){
                    if(((n/2)+1) == a){
                        System.out.print(" "+a);
                    }
                    else if(a%2 == 0){
                        System.out.print(" "+a);
                    }
                    else{
                        System.out.print(" "+a);
                    }
                    --a;
                }
            }
            while(b < n){
                System.out.print(arr[(int)b] + " ");
                ++b;
            }
        }
    }
    sc.close();
    }
}