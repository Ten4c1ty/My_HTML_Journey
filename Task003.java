import java.util.Scanner;
    public class Task003{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Start: ");
        int start = sc.nextInt();
        System.out.println("End: ");
        int end = sc.nextInt();
        int num=start;
        while(num <= end){
            int i = 2;
            int prime = 1;
            if(num <= 1){
                prime = 0;
            }
            else{
            while(i<num/2){
                if(num%i==0){
                prime=0;
                break;
                }
                i++;
        }
            }
            if(prime==1){
                System.out.println(num);
            }
            num++;
    }
  }
}