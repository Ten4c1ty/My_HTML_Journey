import java.util.*;
public class LineTrip{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int t = sc.nextInt();
        if((1 <= t) && (t <= 1000)){
            for(int a = 1; a <= t; a++){
                int n = sc.nextInt();
                int x = sc.nextInt();
                int path = 0;
                int max = 0;
                if((1 <= n) && (n <= 50) && (2 <= x) && (x <= 100)){
                    int [] gas = new int [n];
                    for(int b = 0; b < n;b++){
                        gas[b] = sc.nextInt();
                        if((gas[b] >= x) && (gas[b] > 0)){
                            flag = true;
                        }
                    }
                    if(flag == true){
                        for(int c = 1; c <= x; c++){
                            flag = true;
                            for(int d = 0; d < n; d++){
                                if(gas[d] == c){
                                    path++;
                                    flag = false;
                                    break;
                                }
                                else{
                                    flag = true;
                                }
                            }
                            if(flag == true){
                                path++;
                            }
                            if(flag == false){
                                if(c < x){
                                    if(max < path){
                                        max = path;
                                    }
                                }
                                    path = 0;
                            }
                            if(c == x){
                                        path *= 2;
                                        if(max < path){
                                            max = path;
                                        }
                                        path = 0;
                            }
                        }
                    }
                System.out.println(max);
                }
            }
        }
        sc.close();
    }
}