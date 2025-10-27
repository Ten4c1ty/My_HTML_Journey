import java.util.Scanner;
public class HollowTriangleIsoscelesIncomplete{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of the triangle: ");
        int H = sc.nextInt();
        for(int i = 1; i <= H; i++){
            for(int j = 1; j <= (H-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i-1); k++){
                /*if(k == H){
                    for(int m = 1; m <= H; m++){
                        System.out.print(m);
                    }
                    break;
                }*/
                if(i == H){
                    System.out.print(k);
                }
                else if(k == 1 || k == H){
                    System.out.print(k);
                    System.out.print(" ");
                }
                /*else if(k == H){
                    for(int m = 1; m <= H; m++){
                        System.out.print(m);
                    }
                    break;
                }*/
                //else{
                /*else if(k > 1 && k < i){
                    System.out.print(" ");
                }*/
            }
            System.out.println();
        }
    }
}