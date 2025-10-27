import java.util.Scanner;
public class SplittingStrings{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your collection of letters with splitting punctuations: ");
        String words = sc.nextLine();
        System.out.println("Please enter your splitting punctuation: ");
        String punc = sc.nextLine();
        String word = "";
        for(int i = 0; i < words.length(); i++){
            char punct = punc.charAt(0);
            if(words.charAt(i) == punct){
                System.out.println(word);
                word = "";
            }
            else{
                word += words.charAt(i);
                if(i == (words.length()-1)){
                    System.out.println(word);
                }
            }
        }
    }
}