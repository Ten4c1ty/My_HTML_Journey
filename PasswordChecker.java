import java.util.Scanner;
public class PasswordChecker{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your password: ");
        String pass = sc.nextLine();
        int counter = 0;
        for(int i = 0; i < pass.length(); i++){
            if(pass.charAt(i) == name.charAt(0)){
                for(int j = i, k = 0; j < (name.length()+i); j++, k++){
                    if(pass.charAt(j) == name.charAt(k)){
                        counter++;
                    }
                    else{
                        counter = 0;
                        break;
                    }
                }
            }
        }
        if(counter >= name.length()){
            System.out.println("Invalid");
        }
        else{
            System.out.println("Valid");
        }
    }
}