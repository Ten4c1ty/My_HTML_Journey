import java.util.Scanner;
public class ArrayCreation{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array : ");
        int N = sc.nextInt();
        int [] array = new int[N];
        for(int i = 0; i < N; i++){
            System.out.println("Please enter the number of index "+i+" : ");
            array[i] = sc.nextInt();
        }
        System.out.println("Please enter another number : ");
        int another = sc.nextInt();
        int [] array1 = new int [N+1];
        System.out.println("The elements of the array are: ");
        for(int j = 0; j < array.length; j++){
            array1[j] = array[j];
            System.out.println(j+": "+array1[j]);
        }
        array1[N] = another;
        System.out.println("After resizing the array: ");
        for(int k = 0; k < array1.length; k++){
            System.out.print(array1[k]+" ");
        }
    }
}