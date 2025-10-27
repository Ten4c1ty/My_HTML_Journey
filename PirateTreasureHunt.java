import java.util.Scanner;
public class PirateTreasureHunt{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the hidden pass: ");
        String words = sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i = 0; i < words.length(); i++){
            int convert = (int) words.charAt(i);
            if((convert <= 122 && convert >= 97) || (convert >= 65 && convert <= 90)){
                if(convert == 97 || convert == 101 || convert == 105 || convert == 111 || convert == 117){
                    vowelCount++;
                }
                else{
                    consonantCount++;
                }
            }
        }
        if(vowelCount == 0 || consonantCount == 0){
            System.out.println("Blimey! No Plunder!!");
        }
        else if(vowelCount%3 == 0 && consonantCount%5 == 0){
            System.out.println("Aaarr! Me Plunder!!");
        }
        else{
            System.out.println("Blimey! No Plunder!!");
        }
    }
}