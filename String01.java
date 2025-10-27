import java.util.Scanner;
public class String01{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your sentence");
        String s1 = sc.nextLine();//Java programming is fun.
        char ch1 = 'J';
        System.out.println(s1);
        System.out.println(ch1);
        int i1 = s1.length();
        System.out.println(i1);
        String s2 = s1.toLowerCase();
        String s3 = s1.toUpperCase();
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        int ascii = (int)ch1;
        System.out.println(ascii);
        String s4 = "apple";
        String s5 = "pl";
        int i4 = s4.length();
        int i5 = s5.length();
        String new_string = "";
        for(int i = 0; i<i4; i++){
            boolean matched = false;
            char ch4 = s4.charAt(i);
            for(int j = 0; j<i5; j++){
                if (ch4 == s5.charAt(j)){
                    matched = true;
                    break;
                }
            }
            if(matched == false){
                new_string = new_string + ch4;
            }
            matched = false;
        }
        System.out.print(new_string);
    }
}