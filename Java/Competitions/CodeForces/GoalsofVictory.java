import java.util.*;
public class GoalsofVictory{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if((1 <= t) && (t <= 500)){
            for(int a= 0; a < t; a++){
                int n = sc.nextInt();
                int [] arr = new int[n-1];
                boolean flag = false;
                if((2 <= n) && (n <= 100)){
                    for(int b = 0; b < (n-1); b++){
                        arr[b] = sc.nextInt();
                        if((-100 <= arr[b]) && (arr[b] <= 100)){
                            flag = true;
                        }
                    }
                    if(flag == true){
                    }
                }
            }
        }
        sc.close();
    }
}