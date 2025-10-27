import java.util.*;
public class Repititions{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long counter = 0;
        long previous = 0;
        if(s.length() > 1){
        for(int a = 0; a < s.length(); a++){
            boolean flag = true;
            for(int b = (a+1); b < s.length(); b++){
                if(s.charAt(a) == s.charAt(b)){
                    flag = true;
                    ++counter;
                    ++a;
                }
                else{
                    flag = false;
                    ++counter;
                    ++a;
                    break;
                }
            }
            if(previous < counter){
                    previous = counter;
                    }
            counter = 0;
            if((s.charAt(s.length()-1) == s.charAt(s.length()-2)) &&(a == s.length()-1) && (flag == true)){
            ++previous;
        }
        }
        //if((s.charAt(s.length()-1) == s.charAt(s.length()-2)) &&(a == s.length()-1)){
            //previous++;
        //}
        }
        else if(s.length() == 1){
            ++previous;
        }
        System.out.println(previous);
        sc.close();
    }
}