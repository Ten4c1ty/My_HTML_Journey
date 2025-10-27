import java.util.Scanner;
    public class TaxAge{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you income: ");
        double income = sc.nextDouble();
        System.out.println("Please enter you age: ");
        int age = sc.nextInt();
        if(age >= 18){
            if(income>20000.00){
                double tax = income*10/100;
                System.out.println("Your tax amounts in "+tax+" Tk");
            }
            else if(income<=20000.00 && income>=10000.00){
                double tax = income*5/100;
                System.out.println("Your tax amounts in "+tax+" Tk");
            }
            else{
                double tax = 0.00;
                System.out.println("Your tax amounts in "+tax+" Tk");
            }
        }
        else{
             double tax = 0.00;
             System.out.println("Your tax amounts in "+tax+" Tk");
        }
    }
}