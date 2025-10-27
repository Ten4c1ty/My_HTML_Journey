import java.util.Scanner;
public class modulusDivisibility{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your 1st integer: ");
        int a = sc.nextInt();
        System.out.println("Please enter your 2nd integer: ");
        int b = sc.nextInt();
        int a1 = a;
        int b1 = b;
        int i = 1;
        while(i>0){
            int remainder = (a1-(b1*i));
            if(remainder < 0){
                remainder = (a1-(b1*(i-1)));
                System.out.println(remainder);
                System.out.println(i-1);
                break;
            }
            else if (remainder == 0){
                System.out.println(remainder);
                System.out.println(i);
                break;
            }
            i++;
        }
        
    }
}