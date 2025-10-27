import java.util.Scanner;
public class MysteriousSeriesIncomplete{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the term you want to find: ");
        int n = sc.nextInt();
        String s = "";
        int num = 0;
        for(int i = 1; i < n; i++){
            if(i%2 != 0){
                s = "Odd-positioned terms";
                if(i == 1)
                    num = 0;
                num = (i/2);
            }
            else{
                s = "Even-positioned terms";
                if(i%2 == 0){
                    
                }
            }
        }
    }
}