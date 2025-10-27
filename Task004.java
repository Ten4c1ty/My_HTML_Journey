import java.util.Scanner;
    public class Task004{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Customer: ");
        int number = sc.nextInt();
        double sum = 0.0;
        for(int i=1; i<= number; i++){
            System.out.println("Item Number for Customer-"+i+": ");
            int list = sc.nextInt();
            for(int l=1; l<= list; l++){
                System.out.println("Item-"+l+": ");
                double price = sc.nextDouble();
                sum = sum + price;
            }
            double average = sum/list;
            System.out.println("Average for Customer-"+i+": "+average);
            sum = 0;
        }
    }
}
        