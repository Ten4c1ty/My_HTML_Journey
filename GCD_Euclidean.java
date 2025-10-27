import java.util.Scanner;
public class GCD_Euclidean{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a number: ");
        int a = sc.nextInt();
        System.out.println("Please choose a number: ");
        int b = sc.nextInt();
        int counter = 0;
        if(a>b){
            System.out.print("");
        }
        else if(b>a){
            int c = b;
            b = a;
            a = c;
        }
        int i = 0;
        while(b>0){
            i = a;
            a = b;
            b = i%b;
            counter++;
        }
        System.out.println(a);
    }
}