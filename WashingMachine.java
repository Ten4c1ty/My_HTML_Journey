import java.util.Scanner;
public class WashingMachine{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the weight: ");
        int weight = sc.nextInt();
        System.out.println("Please enter the detergent level: ");
        int detergent = sc.nextInt();
        if(detergent < 20){
            System.out.println("INSUFFICIENT DETERGENT");
        }
        else{
            if(weight > 7000){
                System.out.println("OVERLOADED");
            }
            else if(weight >= 4001 && weight <= 7000){
                System.out.println("Time Estimated: 45 minutes");
            }
            else if(weight <= 4000 && weight >= 2001){
                System.out.println("Time Estimated: 35 minutes");
            }
            else if(weight <= 2000 && weight >=1){
                System.out.println("Time Estimated: 25 minutes");
            }
            else if(weight == 0){
                System.out.println("Time Estimated: 0 minutes");
            }
            else{
                System.out.println("INVALID INPUT");
            }
        }
    }
}