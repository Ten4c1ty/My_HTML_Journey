import java.util.Scanner;
public class Integration_X_N_Formula{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the highest value of the variable: ");
        double highest = sc.nextDouble();
        System.out.println("Please enter the lowest value of the variable: ");
        double lowest = sc.nextDouble();
        System.out.println("Please enter the degree of the variable: ");
        double power = sc.nextDouble();
        double highPower = 1.0;
        double lowPower = 1.0;
        for(double i = 1.0; i <= (power+1.0); i++){
            highPower *= highest;
        }
        for(double j = 1.0; j <= (power+1.0); j++){
            lowPower *= lowest;
        }
        double answer = (highPower-lowPower)/(power+1);
        System.out.println("The answer is "+answer+" .");
    }
}