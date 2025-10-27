import java.util.Scanner;
public class PasswordIncomplete{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String pass = sc.nextLine();
        String fSpecial = "";
        String tSpecial = "";
        if(pass.length() >= 8){
            for(int i = 0; i < pass.length(); i++){
                int convert = (int) pass.charAt(i);
                if(convert == 32 || (convert >= 65 && convert <= 90) || (convert >= 97 && convert <= 122) || (convert >= 48 && convert <= 57)){
                    fSpecial += pass.charAt(i);
                }
                else{
                    tSpecial += pass.charAt(i);
                }
            }
            if(tSpecial.length() > 0 && fSpecial.length() > 0){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        else{
            System.out.println("False");
        }
    }
}