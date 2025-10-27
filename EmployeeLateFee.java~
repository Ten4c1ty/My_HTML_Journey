import java.util.Scanner;
public class EmployeeLateFee{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total number of employees: ");
        int employeesTotal = sc.nextInt();
        int days = 0;
        for(int i = 1; i <= employeesTotal; i++){
            for(int j = 1; j<= 30; j++){
                System.out.println("Were you late on day number "+j+", employee number "+i+" ?");
                boolean flag = sc.nextBoolean();
                if(flag){
                    days++;
                }
            }
            System.out.println("The total late fee of employee number "+i+" is "+(days*0.5)+"$ throughout the month.");
        }
    }
}