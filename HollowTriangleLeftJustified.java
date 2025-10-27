import java.util.Scanner;
public class HollowTriangleLeftJustified{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of the triangle: ");
        int H = sc.nextInt();
        for(int i = 1; i<=H; i++){
            if(i==1 || i==H){
                for(int j = 1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            //else{
            else if(i>1 && i<H){
                for(int k = 1; k<=i; k++){
                    if(k==1 || i==k){
                        System.out.print(k);
                    }
                    //else{
                    else if(i!=k){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}