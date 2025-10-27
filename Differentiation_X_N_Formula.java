import java.util.Scanner;
public class Differentiation_X_N_Formula{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the highest value of the variable: ");
        double highest = sc.nextDouble();
        System.out.println("Please enter the lowest value of the variable: ");
        double lowest = sc.nextDouble();
        System.out.println("Please enter the degree of the variable: ");
        double power = sc.nextDouble();
        double highPower = 1;
        double lowPower = 1;
        for(double i = 1.0; i < power; i++){
            highPower *= highest;
        }
        for(double i = 1.0; i < power; i++){
            lowPower *= lowest;
        }
        double answer = (highPower - lowPower)*power;
        System.out.println("The answer is "+answer+" .");
    }
}