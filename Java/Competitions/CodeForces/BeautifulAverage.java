import java.util.*;
public class BeautifulAverage{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean flag = true;
        if((1 <= t) && (t <= Math.pow(10, 4))){
            for(int c = 0; c < t; c++){
            int n = sc.nextInt();
            int max = 0;
            int current = 0;
            if((1 <= n) && (n <= 10)){
                int arr[] = new int [n];
                for(int a = 0; a < n; a++){
                    arr[a] = sc.nextInt();
                    if((arr[a] >= 1) && (arr[a]) <= 10){
                        flag = true;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                    for(int b = 0; b < n; b++){
                        for(int d = 0; d < n; d++){
                        if((0 <= b) && (b <= d) && (d <= n)){
                        current = ((arr[b] +arr[d])/(2*(d-b+1)));
                        if(max < current){
                            max = current;
                        }
                        }
                    }
                    }
                    System.out.println(max);
                }
                else{}
            }
            }
        }
        sc.close();
    }
}