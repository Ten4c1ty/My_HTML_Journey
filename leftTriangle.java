import java.util.Scanner;
public class leftTriangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of the triangle: ");
        int height = sc.nextInt();
        int m = height-1;
        while(m>=0){
        for(int i = 1;i<=height-m;i++){
            System.out.print(i);
        }
        System.out.println("");
        m--;
        }
    }
}