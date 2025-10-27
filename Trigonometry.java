//Doing trigonometry
public class Trigonometry{
    public static void main(String args[]){
        double a = 4.50;
        double b = 9.50;
        double d = (a*a)+(b*b);
        double c = Math.sqrt(d);
        double sinA = a/c;
        double cosA = b/c;
        double sinB = b/c;
        double cosB = a/c;
        System.out.println(sinA);
        System.out.println(cosA);
        System.out.println(sinB);
        System.out.println(cosB);
    }
}    