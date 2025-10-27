import java.util.Scanner;
import java.util.Arrays;
public class SelectionSortDescendingOrder{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");
        int N = sc.nextInt();
        int arr [] = new int [N];
        for(int i = 0; i < N; i++){
            System.out.println("Please enter the number in index "+i+" : ");
            arr [i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        /*for(int k = 0; k < N; k++){
            System.out.print(arr[k]+" ");
        }*/
        for(int j = N-1; j > 0; j--){
            int min_index = j;
            for(int n = j-1; n >= 0; n--){
                if(arr[n] < arr[min_index]){
                    min_index = n;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[j];
            arr[j] = temp;
        }
        System.out.println("\nSorted Array: ");
        System.out.println(Arrays.toString(arr));
        /*for(int m = 0; m < N; m++){
            System.out.print(arr[m]+" ");
        }*/
    }
}