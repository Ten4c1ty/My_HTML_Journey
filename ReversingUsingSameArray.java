import java.util.Scanner;
public class ReversingUsingSameArray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the array : ");
        int N = sc.nextInt();
        int [] array = new int [N];
        for(int i = 0; i < N; i++){
            System.out.println("Please enter the number for array index number "+i+" : ");
            array[i] = sc.nextInt();
        }
        System.out.println("Reversed using the original array : ");
        for(int j = 0; j < (N/2); j++){
                int temp = array[j];
                array[j] = array[N-j-1];
                array[N-j-1] = temp;
        }
        for(int k = 0; k < N; k++){
            System.out.print(array[k]+" ");
        }
    }
}