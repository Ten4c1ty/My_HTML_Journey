//Printing the last 2 digits
public class StudentID{
    public static void main (String args[]){
        int studentID=1000055777;
        int num1 = studentID%10;
        int num2 = (studentID/10)%10;
        System.out.println(num1);
        System.out.println(num2);
    }
}
       