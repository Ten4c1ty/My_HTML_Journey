//Converting minutes into years and days
public class Conversion{
    public static void main (String args[]){
        int num1 = (3456789/(24*60*365));
        int num2 = ((3456789/(24*60))-(num1*365));
        System.out.println("3456789 minutes is approximately "+num1+" years and "+num2+" days.");
    }
}