import java.util.Scanner;
public class DescendingOrderedString{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the collection of words: ");
        String words = sc.nextLine();
        String word = "";
        String new_word = "";
        for(int i = (words.length()-1); i >= 0; i--){
            if(words.charAt(i) == ' ' || i == 0){
                if(i == 0){
                    word += words.charAt(i);
                }
                for(int j = (word.length()-1); j >= 0; j--){
                    new_word += word.charAt(j);
                }
                System.out.print(new_word);
                word = "";
                new_word = "";
                System.out.print(" ");
            }
            else{
                word += words.charAt(i);
            }
        }
    }
}