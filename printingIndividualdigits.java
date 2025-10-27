import java.util.Scanner;
public class printingIndividualdigits{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter few digits: ");
        int n = sc.nextInt();
        reverseDigits(n);
    }
    public static void reverseDigits(int num){
        if(num == 0)
            System.out.print("");
        else{
            int remainder = num%10;
            num /= 10;
            System.out.println(remainder);
            reverseDigits(num);
        }
    }
}