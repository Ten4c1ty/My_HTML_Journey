import java.util.*;
public class Task2Ass1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sn = "";
        for(int a  = 0; a < s.length(); a++){
            int ascii = (int) s.charAt(a);
            if((ascii <= 122) && (ascii > 97)){
                char ch = (char)(ascii-1);
                sn += ch;
            }
            else if(ascii == 97){
               char ch = (char)122;
               sn += ch;
            }
        }
        System.out.println(sn);
    }
}