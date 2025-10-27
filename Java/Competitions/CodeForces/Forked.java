import java.util.*;
public class Forked{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        if((1 <= t) && (t <= 1000)){
            while(t > 0){
                long a = sc.nextLong();
                long b = sc.nextLong();
                long x = 0;
                long y = 0;
                boolean flag = false;
                if((1 <= a) && (a <= Math.pow(10, 8)) && (1 <= b) && (b <= Math.pow(10, 8))){
                    long xK = sc.nextLong();
                    long yK = sc.nextLong();
                    long xQ = sc.nextLong();
                    long yQ = sc.nextLong();
                    if((0 <= xK) && (xK <= Math.pow(10, 8)) && (0 <= yK) && (yK <= Math.pow(10, 8)) && (0 <= xQ) && (xQ <= Math.pow(10, 8)) && (0 <= yQ) && (yQ <= Math.pow(10, 8)) && ((xK != xQ) || (yQ != yK))){
                        if((xQ == yK) && (yQ == xK)){
                            xQ = -xQ;
                            yQ = -yQ;
                            flag = true;
                        }
                        x = (int)(Math.pow((xQ-a), 2) + Math.pow((yQ-b), 2));
                        y = (int)(Math.pow((xK-a), 2) + Math.pow((yK-b), 2));
                    }
                }
                if(x == y){
                    System.out.println(2);
                }
                else if(flag == true){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
                --t;
            }
        }
        sc.close();
    }
}