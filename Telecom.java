import java.util.Scanner;
public class Telecom{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        long number = sc.nextLong();
        long largest = -999999999;
        long smallest = 999999999;
        int counter = 0;
        for(long i = number; i>0; counter++){
            i=i/10;
        }
        for(long j = number; j>0; counter--){
            long remainder = j%10;
            if(remainder>largest){
                largest = remainder;
            }
            if(remainder<smallest){
                smallest = remainder;
            }
            j = j/10;
        }
        System.out.println("The largest digit is "+largest+" .");
        System.out.println("The smallest digit is "+smallest+" .");
    }
}