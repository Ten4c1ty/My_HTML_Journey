import java.util.Scanner;
public class StringArrayEmail{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of email addresses to validate: ");
        int N = sc.nextInt();
        String [] array = new String [N];
        int i = 0;
        while(i < N){
            System.out.println("Please enter the email address "+i+" to check validity: ");
            array[i] = sc.next();
            i++;
        }
        int counter = 0;
        int ATcounter = 0;
        int ascii12counter = 0;
        int asciicounter = 0;
        int dotcounter = 0;
        int ascii3counter = 0;
        for(int j = 0; j < array.length; j++){
            String str = array[j];
            for(int k = 0; k < str.length(); k++){
                int ascii = (int) str.charAt(0);
                int ascii1 = (int) str.charAt(k+1);
                int ascii2 = (int) str.charAt(k-1);
                if(str.charAt(k) == '@'){
                    ATcounter++;
                    if((ascii1 >= 65 && ascii1 <= 90) || (ascii1 >= 97 && ascii1 <= 122) || (ascii2 >= 65 && ascii2 <= 90) || (ascii2 >= 97 && ascii2 <= 122)){
                        ascii12counter++;
                        for(int m = k+1; m < str.length(); m++){
                        if(str.charAt(m) == '.'){
                            dotcounter++;
                            for(int n = m+1; n < str.length(); n++){
                                int ascii3 = (int) str.charAt(n);
                                if((ascii3 >= 65 && ascii3 <= 90) || (ascii3 >= 97 && ascii <= 122)){
                                    ascii3counter++;
                                }
                            }
                        }
                        }
                    }
                    /*for(int m = k+1; m < str.length(); m++){
                        if(str.charAt(m) == '.'){
                            dotcounter++;
                            for(int n = m+1; n < str.length(); n++){
                                int ascii3 = (int) str.charAt(n);
                                if((ascii3 >= 65 && ascii3 <= 90) || (ascii3 >= 97 && ascii <= 122)){
                                    ascii3counter++;
                                }
                            }
                        }
                    }*/
                }
                if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){
                    asciicounter++;
                }
            }
            if(ATcounter == 0 && ascii12counter >= 2 && asciicounter == 1 && ascii3counter > 0 && dotcounter == 1){
                counter++;
            }
        }
        System.out.println(counter);
    }
}