import java.util.Scanner;
public class RecentangularGarden{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows of the rectangular garden: ");
        int R = sc.nextInt();
        System.out.println("Please enter the number of columns of the rectangular garden: ");
        int C = sc.nextInt();
        System.out.println("Please enter the capacity of the watering can(in Litres): ");
        int L = sc.nextInt();
        int counter = 0;
        for(int i = R*C; i >=0; counter++){
            i = i-L;
        }
        System.out.println("The total water used: "+(R*C));
        System.out.println("The number of refills performed: "+counter);
    }
}