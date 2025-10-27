import java.util.*;
public class CoverinWater{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if((1 <= t) && (t <= 100)){
            for(int a = 1; a <= t; a++){
                int n = sc.nextInt();
                String s = sc.next();
                if((1 <= n) && (n <= 100)){
                        int dcounter = 0;
                        boolean flag = false;
                    for(int b = 0; b < n; b++){
                        char i = s.charAt(b);
                        if((i == '.') && ((b+2) < n) && (i == s.charAt(b+1)) && (i == s.charAt(b+2))){
                            flag = true;
                            break;
                        }
                           if(i == '.'){
                               dcounter++;
                           }
                    }
                    if(flag == true){
                        System.out.println(2);
                    }
                    else{
                        System.out.println(dcounter);
                    }
                }
            }
        }
        sc.close();
    }
}
                           
                           