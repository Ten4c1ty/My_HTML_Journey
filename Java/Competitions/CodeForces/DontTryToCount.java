import java.util.*;
public class DontTryToCount{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if((1 <= t) && (t <= Math.pow(10, 4))){
            for(int a = 1; a <= t; a++){
                int n = sc.nextInt();
                int m = sc.nextInt();
                boolean flag = true;
                if((1 <= (n*m)) && ((n*m) <= 25)){
                    String x = sc.next();
                    String s = sc.next();
                    int counter = 0;
                    for(int b = 0; b < n; b++){
                        if((x.codePointAt(b) >= 97) && (x.codePointAt(b) <= 122)){
                            flag = true;
                        }
                        else{
                            flag = false;
                        }
                    }
                    for(int c = 0; c < m; c++){
                        if((s.codePointAt(c) >= 97) && (s.codePointAt(c) <= 122)){
                            flag = true;
                        }
                        else{
                            flag = false;
                        }
                    }
                    if(flag == true){
                        for(int d = 0; d < n; d++){
                            for(int e = 0; e < m; e++){
                                if(x.charAt(d) == s.charAt(e)){
                                    counter++;
                                    break;
                                }
                                else{
                                    break;
                                }
                            }
                            if((counter == 1) && (m == 1)){
                                System.out.println(0);
                                break;
                            }
                        }
                    }
                    else{}
                }
            }
        }
        sc.close();
    }
}