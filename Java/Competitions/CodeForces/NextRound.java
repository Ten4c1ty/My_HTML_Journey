import java.util.*;
public class NextRound{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int counter = 0;
        boolean flag = false;
        if((1 <= k) && (k <= n) && (n <= 50)){
            int arr[] = new int[n];
            for(int a = 0; a < n; a++){
                arr[a] = sc.nextInt();
                if((0 <= arr[a]) && (arr[a] <= 100)){
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
            for(int b = 0; b < n; b++){
                if((arr[b] >= arr[k-1]) && (arr[b] > 0)){
                    counter++;
                }
            }
            System.out.println(counter);
            }
        }
        sc.close();
    }
}