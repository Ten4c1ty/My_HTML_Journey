import java.util.Scanner;
public class hourMinuteHand{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your hour(s): ");
        int hour = sc.nextInt();
        System.out.println("Please enter your minute(s): ");
        int minute = sc.nextInt();
        double hour_angle = (hour*30.0)+(minute/2.0);
        double minute_angle = (minute * 6);
        double total_angle = hour_angle - minute_angle;
        if(total_angle < 0.0){
            total_angle = -total_angle;
        }
        if(total_angle < 180.0){
            System.out.println("Smaller angle: "+total_angle+" degrees");
            System.out.println("Larger angle: "+(360-total_angle)+" degrees");
        }
        else if(total_angle > 180.0){
            System.out.println("Smaller angle: "+(360-total_angle)+" degrees");
            System.out.println("Larger angle: "+total_angle+" degrees");
        }
    }
}