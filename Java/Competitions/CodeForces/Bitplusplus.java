import java.util.*;
public class Bitplusplus{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = 0;
        int counter = 0;
        if((1 <= n) && (n <= 150)){
            for(int a = 0; a < n; a++){
                String s = sc.next();
                for(int b = 0; b < s.length(); b++){
                    if(s.charAt(b) == 'X'){
                        counter++;
                    }
                }
                for(int c = 0; c < s.length(); c++){
                    if(counter == 1){
                        if(s.charAt(c) == '+'){
                            X++;
                            counter = 0;
                            break;
                        }
                        else if(s.charAt(c) == '-'){
                            counter = 0;
                            X--;
                            break;
                        }
                    }
                }
            }
            System.out.println(X);
        }
        sc.close();
    }
}