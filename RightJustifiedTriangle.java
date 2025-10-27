import java.util.Scanner;
public class RightJustifiedTriangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of the right justified triangle: ");
        int H = sc.nextInt();
        for(int i = 1; i<= H; i++){
            for(int j = H-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k = H-i+1; k<=H; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}