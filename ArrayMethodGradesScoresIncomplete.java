import java.util.Scanner;
public class ArrayMethodGradesScoresIncomplete{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        getScores();
    }
    public static void getScores(){
        char [] studentGrades = new char[]{'A', 'A', 'A', 'B', 'C', 'U', 'Z'};
        int [] studentsScores = new int [7];
        for(int i = 0; i < studentsScores.length; i++){
            if(studentGrades[i] == 'A'){
                studentsScores[i] = 100;
            }
            else if(studentGrades[i] == 'B'){
                studentsScores[i] = 90;
            }
            else if(studentGrades[i] == 'C'){
                studentsScores[i] = 70;
            }
            else{
                studentsScores[i] = 0;
            }
            System.out.println(studentsScores[i]);
        }
    }
}