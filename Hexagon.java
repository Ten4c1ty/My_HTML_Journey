//Finding out area and circumference
public class Hexagon{
    public static void main (String args[]){
        double a = 8.00;
        double b = 3.00;
        double c = (((a/2.00)*(a/2.00))+(b*b));
        double side = Math.sqrt(c);
        double area = ((4.00*(b*(a/2.00))/2.00))+(side*a);
        double circumference = side*6.00;
        System.out.println(area);
        System.out.println(circumference);
    }
}