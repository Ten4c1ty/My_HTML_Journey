import java.util.Scanner;
public class HollowRectangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of the rectangle: ");
        int H = sc.nextInt();
        System.out.println("Please enter the width of the rectangle: ");
        int W = sc.nextInt();
        for(int i = 1; i<=H; i++){
            if(i==1|| i==H){
                for(int j = 1; j<=W; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            else{
            //else if(i>1 && i<H){
                for(int k = 1; k<=W; k++){
                    if(k == 1 || k == W){
                        System.out.print(k);
                    }
                    else if(k>1 && k<W){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}