import java.util.Scanner;
public class WorkerTaskAccountability{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int individual = 0;
        int counter = 0;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 7; j++){
                System.out.println("Please enter the number of tasks worker number "+i+" completed on day "+j+": ");
                int tasks = sc.nextInt();
                sum += tasks;
                individual += tasks;
                counter += tasks;
                if(counter >= 50){
                    counter = 50;
                    break;
                }
            }
            System.out.println("The number of weekly tasks completed by worker number "+i+" are "+individual+" .");
            if(counter == 50){
                System.out.println("The worker number "+i+" met his weekly goals.");
            }
            else{
                System.out.println("The worker number "+i+" didn't met his weekly goals.");
            }
            individual = 0;
            counter = 0;
        }
        System.out.println("The total number of tasks done by all 5 workers this week are "+sum+" .");
        if(sum == 250){
            System.out.println("The workers completed all their works within due time.");
        }
        else{
            System.out.println("The workers were unable to fulfill their works within due time.");
        }
    }
}