import java.util.Scanner;
public class VehiclesCount{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the initial number of vehicles: ");
        int V = sc.nextInt();
        System.out.println("Please enter the monthly growth percentage: ");
        double x = sc.nextDouble();
        System.out.println("Please enter the reduction amount: ");
        int y = sc.nextInt();
        System.out.println("Please enter the total number of months: ");
        int months = sc.nextInt();
        for(int i = 1; i<=months; i++){
            V += (V*x/100.0);
            if(i%6==0){
                V -= y;
            }
        }
        System.out.println("The final number of vehicles: "+V+" .");
    }
}