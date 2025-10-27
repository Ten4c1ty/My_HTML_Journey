import java.util.Scanner;
public class TraceB{
public static void main (String[]args){
  Scanner sc=new Scanner(System.in);

  
        int cnt = 0;
        System.out.println("Please enter length of array 1:");
        int n= sc.nextInt();
        int [] ar1 = new int [n];
        for(int i=0;i<n; i++){
            System.out.println("Please enter elements of arr1:");
             ar1[i]=sc.nextInt();
        }
        System.out.println("Please enter length of array 2:");
        int m= sc.nextInt();
        int [] ar2 = new int [m];
        for(int j = 0; j<m; j++){
            System.out.println("Please enter elements of arr2:");
            ar1[j]=sc.nextInt();
        }
        for(int x= 0; x<n; x++){
            for(int y = 0; y<m; y++){
                if(ar1 [x] == ar2 [y]){
                    cnt++;
                }
            }
        }
    System.out.println(ar1[4]);
    System.out.println(ar2[2]);
        if(cnt== m){
            System.out.println("Array 2 is a subset of Array 1");
        }
        else{
            System.out.println("Array 2 is not a subset of Array 1");
        }
    } 
}
