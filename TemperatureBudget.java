import java.util.Scanner;
public class TemperatureBudget{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the monthly budget: ");
        double budget = sc.nextDouble();
        System.out.println("Please enter the temperature of this month: ");
        double temperature = sc.nextDouble();
        if(-20 < temperature && temperature < -10){
            System.out.println("The total necessary money spent is "+(budget*15/100)+" RUB.");
        }
        else if(-30 < temperature && temperature < -20){
            System.out.println("The total necessary money spent is "+(budget*30/100)+" RUB.");
        }
        else if(temperature < -30){
            System.out.println("The total necessary money spent is "+(budget*50/100)+" RUB.");
        }
        else{
            System.out.println("Invalid.");
        }
    }
}
