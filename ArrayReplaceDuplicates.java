import java.util.Arrays;
public class ArrayReplaceDuplicates{
    public static void main(String [] args){
        int arr [] = {9, -5, 7, 9, -5, 5, 7};
        System.out.println("Before removing duplicates: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nAfter replacing duplicates with 0: ");
        for(int j = 0; j < arr.length; j++){
            for(int k = j+1; k < arr.length; k++){
                if(arr[k] == arr[j]){
                    arr[k] = 0;
                }
            }
            System.out.print(arr[j]+" ");
        }
    }
}