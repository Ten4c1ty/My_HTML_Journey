//Task 04
import java.util.Scanner;
public class Task0004{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.println("Please enter the length of array 1 : ");
        int N = sc.nextInt();
        int [] array1 = new int [N];
        System.out.println("Please enter the elements of arr1 : ");
        for(int i = 0; i<N; i++){
            int j = sc.nextInt();
            array1 [i] = j;
        }
        System.out.println("Please enter the length of array 2 : ");
        int M = sc.nextInt();
        int [] array2 = new int [M];
        System.out.println("Please enter the elements of arr2 : ");
        for(int k = 0; k<M; k++){
            int p = sc.nextInt();
            array2 [k] = p;
        }
        for(int q = 0; q<N; q++){
            for(int r = 0; r<M; r++){
                if(array1 [q] == array2 [r]){
                    counter++;
                }
            }
        }
        if(counter == M){
            System.out.println("Array 2 is a subset of Array 1.");
        }
        else{
            System.out.println("Array 2 is not a subset of Array 1.");
        }
    } 
}