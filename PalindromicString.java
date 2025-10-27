import java.util.Scanner;
public class PalindromicString{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the collection of words: ");
        String words = sc.nextLine();
        String words1 = "";
        for(int i = (words.length()-1); i >= 0; i--){
            words1 += words.charAt(i);
        }
        if(words1.equals(words)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}