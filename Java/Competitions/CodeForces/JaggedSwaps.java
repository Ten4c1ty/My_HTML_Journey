import java.util.*;
public class JaggedSwaps{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int c = 1; c <= t; c++){
        if((1 <= t) && (t <= 5000)){
            int n = sc.nextInt();
            boolean flag = true;
            if((3 <= n) && (n <= 10)){
            int [] arr = new int [n];
            for(int a = 0; a < n; a++){
                arr[a] =sc.nextInt();
                if((1<= arr[a]) && (arr[a] <= n)){
                    flag = true;
                }
                else{
                    flag = false;
                }
            }
            if(flag == true){
                for(int b = 0; b < n; b++){
                    if((arr[b] == 1)  && ((b+2) < n)){
                        if((arr[b] < arr[b+1]) || (arr[b+2] < arr[b+1])){
                        System.out.println("YES");
                        break;
                        }
                    }
                    else{
                        System.out.println("NO");
                        break;
                    }
                }
            }
            else{}
            }
            else{}
        }
        else{}
        }
        sc.close();
    }
}