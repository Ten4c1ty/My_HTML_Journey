import java.util.*;
public class CW03{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        double [] arr = new double [(int)N];
        long remove = 0;
        for(long a = 0; a < N; a++){
            arr[(int)a] = sc.nextDouble();
            if((a-1) >= 0){
            if(arr[(int)(a-1)] == arr[(int)a]){
                remove++;
            }
            }
        }
        double [] arr2 = new double [(int)(N-remove)];
        long c = 0;
        for(long b = 1; b < N; b++){
            if(arr[(int)(b-1)] != arr[(int)b]){
                arr2[(int)c] = arr[(int)b-1];
                c++;
            }
        }
        System.out.println("New Array: "+Arrays.toString(arr2));
        System.out.println("Removed elements : "+remove+" .");
    }
}