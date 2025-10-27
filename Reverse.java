import java.util.Scanner;
public class Reverse{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the collection of words: ");
        String words = sc.nextLine();
        for(int i = (words.length()-1); i >= 0; i--){
            System.out.print(words.charAt(i));
        }
    }
}