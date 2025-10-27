import java.util.Scanner;
public class PalindromicTriangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of the triangle: ");
        int H = sc.nextInt();
        for(int i = 1; i <= H; i++){
            for(int j = 1; j <= (H-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(k);
            }
            for(int m = i-1; m > 0; m--){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}