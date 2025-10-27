import java.util.Scanner;
public class rightTriangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of the triangle: ");
        int height = sc.nextInt();
        int m = height-1;
        while(m>=0){
            for(int l = 1;l<=m;l++){
                System.out.print(" ");
            }
            for(int i = m+1;i<=height;i++){
            System.out.print(i);
            }
            System.out.println("");
            m--;
        }
    }
}