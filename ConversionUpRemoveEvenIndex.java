import java.util.Scanner;
public class ConversionUpRemoveEvenIndex{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the collection of words: ");
        String words = sc.nextLine();
        String new_words = "";
        for(int i = 0; i < words.length(); i++){
            if(i%2 != 0){
                char ch = words.charAt(i);
                int ascii = (int) ch;
                if(ascii >= 97 && ascii <= 122){
                    ascii -= 32;
                    char ch1 = (char) ascii;
                    new_words += ch1;
                }
                else{
                    new_words += ch;
                }
            }
        }
        System.out.println(new_words);
    }
}