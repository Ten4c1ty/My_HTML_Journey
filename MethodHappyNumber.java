import java.util.Scanner;
public class MethodHappyNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int HappyNumber = sc.nextInt();
        boolean check = isHappyNumber(HappyNumber);
        System.out.println(check);
    }
    public static boolean isHappyNumber(int num){
        int counter = 0;
        boolean flag = false;
        if(num <= 0){
            flag = false;
        }
        for(int i = num, square = 0; i > 0; counter++){
            int remainder = i%10;
            i /= 10;
            square += (remainder*remainder);
            if(square == 1){
                flag = true;
            }
            else if(square == 4){
                flag = false;
            }
        }
        return flag;
    }
}