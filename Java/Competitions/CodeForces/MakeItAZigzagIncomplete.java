import java.util.*;
public class MakeItAZigzagIncomplete{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int counter = 0;
        if((1 <= t) && (t <= 10000)){
            int n = sc.nextInt();
            counter+=n;
            //int minimum = 0;
            boolean flag = true;
            if((2 <= n) && (counter <= 200000)){
                int []arr = new int[n];
                 for(int a = 0; a < n; a++){
                     arr[a] = sc.nextInt();
                     //if((1 <= arr[b]) && (arr[b] <= Math.pow(10, 9))){
                         //flag= true;
                     //}
                     //else{
                         //flag = false;
                         //break;
                     //}
                }
                 if(flag == true){
                     for(int c = 0; c < n; c++){
                         //if((c+1) < n)){
                         if(c%2 == 0){
                             if(0 <= (c-1)){
                             if((arr[c-1] > arr[c]) && (arr[c+1] > arr[c])){
                                 
                             }
                             }
                             else{
                                 if(arr[c+1] < arr[c]){
                                     
                                 }
                                }
                            }
                        }
                    }
                    }
                }
            sc.close();
    }
}