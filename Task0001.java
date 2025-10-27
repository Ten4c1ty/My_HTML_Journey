//Task 01
import java.util.Scanner;
public class Task0001{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int N = sc.nextInt();
        int [] array1 = new int [N];
        int [] array2 = new int [N];
        System.out.println(array1);
        for(int i = 0; i<N; i++){
            System.out.println("Enter element number "+i+" : ");
            int element = sc.nextInt();
            array1 [i] = element;
            if(element>0){
                array2 [i] = 1;
            }
            else{
                array2 [i] = 0;
            }
        }
        System.out.println("Original array : ");
        for(int k = 0; k<N; k++){
        System.out.print(array1 [k]+" ");
        }
        System.out.println();
        System.out.println("After modifying : ");
        for(int m = 0; m<N; m++){
        System.out.print(array2 [m]+" ");
        }
    }
}