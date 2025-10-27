import java.util.Scanner;
public class HollowTriangleRightJustified{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of the triangle: ");
        int H = sc.nextInt();
        for(int i = 0; i < H; i++){
            for(int j = 1; j <= (H-i-1); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= H; k++){
                if(k == H-i || k == H || i == (H-1)){
                    System.out.print(k);
                }
                else if(k > (H-i) && k < H){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}