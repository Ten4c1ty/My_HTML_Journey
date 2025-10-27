import java.util.*;
public class NotelockIncomplete{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int counter = 0;
        if((1 <= t) && (t <= 100)){
            for(int a= 0; a < t; a++){
                int n = sc.nextInt();
                int k = sc.nextInt();
                counter += n;
                int protect = 0;
                boolean flag = false;
                if(counter <= 1000){
                if((2 <= k) && (k <= n) && (n <= 1000)){
                    String s = sc.next();
                    for(int c = 0; c < s.length(); c++){
                    if((s.charAt(c) == '1') || (s.charAt(c) == '0')){
                        flag = true;
                    }
                    }
                    if(flag== true){
                    if(s.charAt(0)== '1'){
                            protect++;
                        }
                    //System.out.println(protect);
                for(int d = 0; d < n; d++){
                    flag = false;
                    if(d-k >= -1){
                    for(int e = k; e > 0; e--){
                        //if(d >= k){
                        if(s.charAt(d-e) == '0'){
                            flag = false;
                        }
                        else{
                            flag = true;
                            break;
                        }
                        //}
                    }
                    }
                    if(flag == true){
                        protect++;
                    }
                    //System.out.println(protect);
                }
                }
                System.out.println(protect);
                }
                }
            }
        }
        sc.close();
    }
}