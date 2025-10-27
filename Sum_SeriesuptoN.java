import java.util.Scanner;
public class Sum_SeriesuptoN{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total numbers: ");
        int N = sc.nextInt();
        oneToN(1, N);
        System.out.println();
        nToOne(1, N);
        System.out.println();
        System.out.println(recursiveSum(1, N));
    }
    public static void oneToN(int num1, int num2){
        if(num1 == num2)//base case
            System.out.print(num1);
        
        else{//recursive case
            System.out.print(num1+" ");
            num1++;
            oneToN(num1, num2);
        }
    }
    public static void nToOne(int num3, int num4){
        if(num3 == num4)
            System.out.print(num4);
        
        else{
            System.out.print(num4+" ");
            num4--;
            nToOne(num3, num4);
        }
    }
    public static int recursiveSum(int num5, int num6){
        if(num5 == num6)
            return num6;
        
        return num6+recursiveSum(num5, num6-1);
    }
}