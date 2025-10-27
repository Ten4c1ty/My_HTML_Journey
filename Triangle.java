import java.util.Scanner;
    public class Triangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you number: ");
        float num1 = sc.nextFloat();
        System.out.println("Please enter you number: ");
        float num2 = sc.nextFloat();
        System.out.println("Please enter you number: ");
        float num3 = sc.nextFloat();
        if(num1 == num2 && num1 == num3){
            System.out.println("This is a Equilateral triangle");
        }
        else if(num1 == num2 || num1 == num3){
            System.out.println("This is a Isosceles triangle");
        }
        else{
            System.out.println("This is a Scalene triangle");
        }
    }
}