import java.util.*;
public class HowMuchDoesDaytonaCost{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        if((1 <= t) && (t <= 1000)){
            for(int a = 0; a < t; a++){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int counter = 0;
                boolean flag = false;
                if((1 <= n) && (n <= 100) && (1 <= k) && (k <= 100)){
                    int arr[] = new int[n];
                    for(int b = 0; b < n; b++){
                        arr[b] = sc.nextInt();
                        if((1 <= arr[b]) && (arr[b] <= 100)){
                            flag = true;
                        }
                    }
                    if(flag == true){
                        for(int c = 0; c < n; c++){
                            if(arr[c] == k){
                                counter++;
                                break;
                            }
                        }
                        if(counter >= 1){
                            System.out.println("YES");
                        }
                        else{
                            System.out.println("NO");
                        }
                    }
                }
            }
        }
        sc.close();
    }
}