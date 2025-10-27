import java.util.Arrays;
public class ArrayDuplicateLessIncomplete{
    public static void main(String [] args){
        int arr [] = {23, 100, 23, 56, 100};
        System.out.println("Input array: ");
        int counter = 0;
        int N = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    counter++;
                }
            }
            N = arr.length-counter;
            counter = 0;
            //int arr [] = int [N];
        }
        System.out.println("\nNew array: ");
        for(int k = 0; k < arr.length; k++){
            for(int m = k+1; m < arr.length; m++){
                if(counter > 0){
                    continue;
                }
                if(arr[k] != arr[m]){
                    arr[k] = arr[k];
                }
                else{
                    counter++;
                }
            }
            System.out.print(arr[k]+" ");
        }
    }
}