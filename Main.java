import java.util.Scanner;
public class Main{
   public static void main(String[]args){
    String[] shot= {"Mercury","Venus","Earth","Mars","Jupiter"};
    double[] x_coordinates={0.39,0.72,1.00,1.52,-5.20};
    double[] y_coordinates={0.24,0.00,0.00,0.99,2.86};
    double[] z_coordinates={-0.10,0.44,-0.02,0.21,0.42};
    Scanner sc= new Scanner(System.in);
    String s= sc.nextLine();
    int n=shot.length;
    boolean found= suspect(s,shot,n-1);
    if(found){
      int index= forensic(s,shot,n-1);
      double distance= gushing(index,shot,x_coordinates,y_coordinates,z_coordinates,n-1);
      String close= ClosePlanet(index,shot,x_coordinates,y_coordinates,z_coordinates,n-1);
      System.out.println("Closest Planet: "+close);
      System.out.println("Distance: "+ distance);
    }else{
      System.out.print("Invalid input.");
    }
  }
  public static boolean suspect(String s,String[] shot,int n){
    if(n<0){
      return false;
    }
    if(s.equals(shot[n])){
      return true;
    }
    return suspect(s,shot,n-1);
  }
  public static int forensic(String s,String[] shot,int n){
    if(s.equals(shot[n])){
      return n;
    }
    return forensic(s,shot,n-1);
  }
  public static double gushing(int index,String[] shot,double[] x,double[] y,double[] z,int n){
    double distance=100;
    for(int i=0;i<n;i++){
      if(i==index){
        continue;
      }
      double total= (Math.pow((x[i]-x[index]),2)+Math.pow((y[i]-y[index]),2)+Math.pow((z[i]-z[index]),2));
      if(total<distance){
        distance=total;
      }
    }
    return distance;
  }
  public static String ClosePlanet(int index,String[] shot,double[] x,double[] y,double[] z,int n){
    double distance=100;
    int j=0;
    for(int i=0;i<n;i++){
      if(i==index){
        continue;
      }
      double total= (Math.pow((x[i]-x[index]),2)+Math.pow((y[i]-y[index]),2)+Math.pow((z[i]-z[index]),2));
      if(total<distance){
        distance=total;
        j=i;
      }
    }
    return shot[j];
  }  
}