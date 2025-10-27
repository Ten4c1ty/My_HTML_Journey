//Task 02
import java.util.Scanner;
public class Task0002{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int N = sc.nextInt();
        int [] array = new int [N];
        boolean flag = true;
        for(int i = 0; i<N; i++){
            System.out.println("Enter a number : ");
            int number = sc.nextInt();
            array [i] = number;
        }
        System.out.println("Enter the searching element : ");
        int search = sc.nextInt();
        for(int m = 0; m<N; m++){
            if(search == array [m]){
                System.out.println(search+" is at index "+m);
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Element not found.");
        }
    }
}