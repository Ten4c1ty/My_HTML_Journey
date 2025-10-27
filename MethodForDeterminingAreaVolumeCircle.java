import java.util.Scanner;
public class MethodForDeterminingAreaVolumeCircle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius: ");//diameter
        int radius = sc.nextInt();
        //double radius = sc.nextDouble();
        //int diameter = sc.nextInt();
        System.out.println("Please enter the specified type: ");
        String specify_type = sc.next();//Problems using nextLine
        double area = circleArea(radius);//diameter
        System.out.println(area);
        double volume = sphereVolume(radius);//diameter
        System.out.println(volume);
        findSpace(radius, specify_type);//diameter
    }
    public static double circleArea(double num1){
        //double radius = diameter/2;
        double area = Math.PI*num1*num1;//num1 = radius
        return area;
    }
    public static double sphereVolume(double num2){
        //double radius = diameter/2;
        double volume = Math.PI*4*num2*num2*num2/3;//num2 = radius
        return volume;
    }
    public static void findSpace(int num3, String type){
        if(type.equals("circle")){
            double area = circleArea(num3);
            System.out.println(area);
        }
        else if(type.equals("sphere")){
            double volume = sphereVolume(num3);
            System.out.println(volume);
        }
        else{
            System.out.println("Wrong Parameter.");
        }
    }
}