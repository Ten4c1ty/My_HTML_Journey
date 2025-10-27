import java.util.*;
public class BeautifulString{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean flag = true;
        String s = "";
        if((1 <= t) && (t <= 3000)){
            for(int a = 0; a < t; a++){
            int n = sc.nextInt();
            if((1 <= n) && (n <= 10)){
                s = sc.next();
            }
            for(int b = 0; b < n; b++){
                if((s.charAt(b) == '0') || (s.charAt(b) == '1')){
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                
            }
            }
        }
        sc.close();
    }
}