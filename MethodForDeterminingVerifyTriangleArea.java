import java.util.Scanner;
public class MethodForDeterminingVerifyTriangleArea {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the first side of the triangle: ");
        int side1 = sc.nextInt();
        System.out.println("Please enter the length of the second side of the triangle: ");
        int side2 = sc.nextInt();
        System.out.println("Please enter the length of the third side of the triangle: ");
        int side3 = sc.nextInt();
        boolean res = isTriangle(side1, side2, side3);
        System.out.println(res);
        triArea(side1, side2, side3);
    }
    public static boolean isTriangle(int num1, int num2, int num3){
        if((num1 + num2 > num3) && (num2 + num3 > num1) &&(num3 + num1 > num2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void triArea(int num1, int num2, int num3){
        if(isTriangle(num1, num2, num3)){
            double semiperimeter = (num1 + num2 + num3)/2;
            double area = Math.sqrt(semiperimeter*(semiperimeter-num1)*(semiperimeter-num2)*(semiperimeter-num3));
            System.out.println(area);
        }
        else{
            System.out.println("Can't form triangle.");
        }
    }
}