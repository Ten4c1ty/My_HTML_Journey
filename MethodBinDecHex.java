import java.util.Scanner;
public class MethodBinDecHex{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a binary number: ");
        String binary = sc.next();
        int decimal = toDecimal(binary);
        String hex = toHex(decimal);
        System.out.println(hex);
    }
    public static int toDecimal(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            int num1 = (int) (str.charAt(i) - 48);
            for(int j = str.length()-i-1; j > 0; j--){
                num1 *= 2;
            }
            if(i == str.length()-1){
                num1 *= 1;
            }
            sum += num1;
        }
        return sum;
    }
    public static String toHex(int num){
        int counter = 0;
        String hexa = "";
        for(int i = num; i > 0; counter++){
            int remainder = i%16;
            i /=16;
            if(remainder >= 10 && remainder <= 15){
                char ascii = (char) (65+(remainder-10));
                hexa +=ascii;
            }
            else{
                hexa +=remainder;
            }
        }
        return hexa;
    }
}