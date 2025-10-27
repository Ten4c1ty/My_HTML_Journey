import java.util.*;
public class CW02{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s = s1+" "+s2;
        for(long b = 0; b < s.length(); b++){
            int ascii = (int) s.charAt((int)b);
            if(((ascii >= 65) && (ascii <= 90)) || ((ascii >= 97) && (ascii <= 122))){
                sum+= ascii;
            }
        }
        System.out.println(s);
        System.out.println(sum);
    }
}