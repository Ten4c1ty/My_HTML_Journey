import java.util.Scanner;
public class IsoscelesTriangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of the isosceles triangle: ");
        int H = sc.nextInt();
        for(int i = 1; i<=H; i++){
            for(int j = H-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}