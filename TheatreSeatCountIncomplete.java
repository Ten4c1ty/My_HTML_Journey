import java.util.Scanner;
public class TheatreSeatCountIncomplete{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total number of rows: ");
        int rows = sc.nextInt();
        int sum = 0;
        int VIP = 0;
        for(int i = 1; i<=rows; i++){
            System.out.println("Please enter the total number of seats in row number "+i+" : ");
            int seats = sc.nextInt();
            //for(){
            //}
            if(seats%5==0){
                VIP += seats;
            }
            sum += seats;
        }
        sum = sum - VIP;
        System.out.println("The total number of seats available for general public are "+sum+" .");
        System.out.println("The total number of seats available for VIP reserved are "+VIP+" .");
    }
}