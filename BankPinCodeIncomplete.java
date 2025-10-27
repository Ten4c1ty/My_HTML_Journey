import java.util.Scanner;
public class BankPinCodeIncomplete{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your PIN code: ");
        long pin = sc.nextLong();
        int counter = 0;
        for(long i = pin; i>0; counter++){
            i=i/10;
        }
        for(long j = pin; j>0; counter--){
            long remainder = j%10;
            j = j/10;
            
        }
    }
}