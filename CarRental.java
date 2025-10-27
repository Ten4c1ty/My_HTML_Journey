import java.util.Scanner;
public class CarRental{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the car type you want to: ");
        System.out.print("Economy (costs 1000 Taka): ");
        boolean economy = sc.nextBoolean();
        if(economy){
            double cost = 1000d;
            System.out.println("Please enter the number of days: ");
            int days = sc.nextInt();
            System.out.println("Please type if u want the car on weekends or not: ");
            boolean weekend = sc.nextBoolean();
            if(days > 7){
                cost -= (cost*10/100);
            }
            if(weekend){
                cost -= (cost*5/100);
            }
            System.out.println("The total cost is "+cost+" Taka.");
        }
        System.out.print("Standard (costs 1500 Taka): ");
        boolean standard = sc.nextBoolean();
        if(standard){
            double cost = 1500d;
            System.out.println("Please enter the number of days: ");
            int days = sc.nextInt();
            System.out.println("Please type if u want the car on weekends or not: ");
            boolean weekend = sc.nextBoolean();
            if(days > 7){
                cost -= (cost*10/100);
            }
            if(weekend){
                cost -= (cost*5/100);
            }
            System.out.println("The total cost is "+cost+" Taka.");
        }
        System.out.print("Luxury (costs 2000 Taka): ");
        boolean luxury = sc.nextBoolean();
        if(luxury){
            double cost = 2000d;
            System.out.println("Please enter the number of days: ");
            int days = sc.nextInt();
            System.out.println("Please type if u want the car on weekends or not: ");
            boolean weekend = sc.nextBoolean();
            if(days > 7){
                cost -= (cost*10/100);
            }
            if(weekend){
                cost -= (cost*5/100);
            }
            System.out.println("The total cost is "+cost+" Taka.");
        }
    }
}