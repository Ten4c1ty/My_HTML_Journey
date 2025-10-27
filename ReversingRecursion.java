import java.util.Scanner;
public class ReversingRecursion{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a collection of words: ");
        String words = sc.nextLine();
        System.out.println(reverse_string(words, 0));
    }
    public static String reverse_string(String s, int idx){
        if((s.length()-1) == idx)
            return s;
        return s.charAt(s.length()-1)+reverse_string( s.substring(0, s.length()-1), idx);
    }
}