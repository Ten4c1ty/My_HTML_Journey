//Task 03
import java.util.Scanner;
public class Task0003{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int N = sc.nextInt();
        double [] array = new double [N];
        double maximum = -9999999.999999;
        double minimum = 9999999.999999;
        double sum = 0.0;
        double average = 0.0;
        for(int i = 0; i<N; i++){
            System.out.println("Enter a number : ");
            double number = sc.nextDouble();
            if(number>maximum){
                maximum = number;
            }
            if(number<minimum){
                minimum = number;
            }
            sum = sum + number;
            average = average + number;
            array [i] = number;
        }
        for(int j = 0; j<N; j++){
            if(minimum == array [j]){
                System.out.println("Minimum element "+minimum+" found at index "+j);
            }
            if(maximum == array [j]){
                System.out.println("Maximum element "+maximum+" found at index "+j);
            }
        }
        System.out.println("Summation : "+sum);
        System.out.println("Average : "+(average/N));
    }
}
