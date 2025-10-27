import java.util.*;
public class Java1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.print("Welcome to Java programming.\n");
        System.out.printf("This \nis a \nformatted \nnumber: %.2f\n", 123.456);
        System.out.print("Goodbye!");
        for(int a = 0; a < 5; a++){
            for(int b = 0; b < a; b++){
            System.out.print("*");
            }
            for(int c = 5-a; c > 0; --c){
                System.out.print(" ");
            }
            System.out.println();
        }
        int z = sc.nextInt();
        if(z%2 == 0)
            System.out.println("Even number");
             else
            System.out.println("Odd number");
        sc.close();
        int x = z%2;
        switch(x){
            case 0:
                System.out.println("Even number from switch");
                break;
            case 1:
                System.out.println("Odd number from switch");
                break;
        }
    }
}