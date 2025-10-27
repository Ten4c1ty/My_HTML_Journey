import java.util.Scanner;
public class MethodForDeterminingTax{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to do monthly? ");
        boolean isMonth = sc.nextBoolean();
        if(isMonth){
            System.out.println("Please enter your age: ");
            int age = sc.nextInt();
            System.out.println("Please enter you salary for the month: ");
            int salary = sc.nextInt();
            double t = calcTax(age, salary);
            System.out.print(t);
        }
        else{
            calcYearlyTax();
        }
    }
    public static double calcTax(double num1, double num2){
        double tax = 0.0;
        if(num1 >= 18){
            if(num2 > 20000.00){
                tax = num2*14.0/100.0;
                return tax;
            }
            else if(num2 <= 20000.0 && num2 >= 10000.0){
                tax = num2*7.0/100.0;
                return tax;
            }
            else{
                return tax;
            }
        }
        else{
            return tax;
        }
    }
    public static void calcYearlyTax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        double sum = 0.0;
        for(int i = 1; i <= 12; i++){
                System.out.println("Please enter you salary for month number "+i+": ");
                int salary = sc.nextInt();
                double tax = calcTax(age, salary);
                sum += tax;
                System.out.println("Month"+i+" tax: "+tax);
        }
        System.out.println("Total Yearly Tax: "+sum);
    }
}