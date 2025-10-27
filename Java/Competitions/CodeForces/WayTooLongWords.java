import java.util.*;
public class WayTooLongWords{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((1 <= n) && (n <= 100)){
            for(int c = 0; c < n; c++){
        boolean flag = true;
        int counter = 0;
            String s = sc.next();
            for(int a = 0; a < s.length(); a++){
                int ascii = (int) s.charAt(a) ;
            if((ascii <= 122) && (ascii >= 97)){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
            }
            if(flag == true){
                if(s.length() <= 10){
                    System.out.println(s);
                }
                else{
                    counter = s.length()-2;
                    String s2 ="" + counter;
                    //System.out.println(s.charAt(0) + counter + s.charAt(s.length()-1)); --> char is converted to int
                    System.out.println(s.charAt(0) + s2 + s.charAt(s.length()-1));
                }
            }
            else{}
            }
        }
        sc.close();
    }
}