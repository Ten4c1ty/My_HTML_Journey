import java.util.*;
public class GamewithIntegers{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if((1 <= t) && (t <= 100)){
            for(int a = 1; a <= t; a++){
            int n = sc.nextInt();
            if((1 <= n) && (n <= 1000)){
                if(n%3 == 0){
                    System.out.println("Second");
                }
                else{
                    System.out.println("First");
                }
            }
            }
        }
        sc.close();
    }
}