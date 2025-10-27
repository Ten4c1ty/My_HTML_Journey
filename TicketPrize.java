import java.util.Scanner;
public class TicketPrize{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the ticket number: ");
        long ticket = sc.nextLong();
        int counter = 0;
        int evensum = 0;
        int oddsum = 0;
        /*for(long i = ticket; i>0; counter++){
            i = i/10;
        }*/
        for(long j = ticket; j>0; counter--){
            long remainder = j%10;
            j = j/10;
            if(remainder%2 == 0){
                evensum += remainder;
            }
            else if(remainder%2 != 0){
                oddsum += remainder;
            }
        }
        System.out.println("The main prize category is "+oddsum+" .");
        System.out.println("The bonus prize category is "+evensum+" .");
    }
}