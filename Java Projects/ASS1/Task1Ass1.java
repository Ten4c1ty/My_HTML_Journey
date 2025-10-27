import java.util.*;
public class Task1Ass1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a > b){
            long temp1 = a;
            a = b;
            b= temp1;
        }
        long temp = a;
        long nonprime = 0;
        while(temp <= b){
            for(int c = 2; c <= Math.sqrt(temp); c++){
                if(temp%c == 0){
                    ++nonprime;
                    break;
                }
            }
            ++temp;
        }
        long prime = b-a-nonprime+1;
        System.out.println("There are "+prime+" prime numbers between "+ a + " and "+ b +" .");
    }
}