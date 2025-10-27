import java.util.Scanner;
public class summingIndividualdigits{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter few digits: ");
        int n = sc.nextInt();
        int x = sumDigits(n);
        System.out.println(x);
    }
    public static int sumDigits(int num){
        int remainder = 0;
        if(num == 0)
            return remainder;
        remainder = num%10;
        num /= 10;
        return remainder+sumDigits(num);
    }
}