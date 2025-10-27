import java.util.Scanner;
public class Question2{
    public static void StringCutter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a collection of words: ");
        String s1 = sc.nextLine();
        System.out.println("Please enter the number of characters you want to remove: ");
        int number = sc.nextInt();
        if(number > s1.length())
            System.out.println("Number of characters cannot be larger than the String.");
        else {
            System.out.println("From the back? (true/false): ");
            boolean isBack = sc.nextBoolean();
            if(isBack)
                System.out.println(s1.substring(0, (s1.length()-number)));
            else
                System.out.println(s1.substring((0+number), s1.length()));
        }
    }
    public static void main(String [] args){
        StringCutter();
    }
}