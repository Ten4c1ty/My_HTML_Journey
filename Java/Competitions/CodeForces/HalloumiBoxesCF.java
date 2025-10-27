import java.util.*;
public class HalloumiBoxesCF{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int t = sc.nextInt();
        if((1 <= t) && (t <= 100)){
            for(int e = 1; e <= t; e++){
                int n = sc.nextInt();
                int k = sc.nextInt();
                if((1 <= k) && (k <= n) && (n <= 100)){
                    int [] box = new int [n];
                    for(int a = 0; a < n; a++){
                            box[a] = sc.nextInt();
                        if((box[a] <= Math.pow(10, 9)) && (1 <= box[a])){
                            flag = true;
                        }
                        else{
                            flag = false;
                        }
                    }
                    if(flag == false){
                        System.out.println("NO");
                    }
                    else if(flag == true){
                        if(k >= 1){
                        if(k == 1){
                            for(int b = 0; b < n; b++){
                                for(int c = b+1; c < n; c++){
                                    if(box[b] > box[c]){
                                        flag = false;
                                    }
                                }
                            }
                            if(flag == true){
                                System.out.println("YES");
                            }
                            else{
                                System.out.println("NO");
                            }
                        }
                        else{
                            System.out.println("YES");
                        }
                    }
                    else{
                        System.out.println("NO");
                    }
                    }
                }
                else{
                }
            }
        }
        else{
        }
        sc.close();
    }
}