import java.util.Scanner;
public class CompanyProfitLoss{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of regions: ");
        int number = sc.nextInt();
        double highest = -99999999999999999.999999999;
        double lowest = 999999999999999999.999999999;
        String name$H = "";
        String name$L = "";
        String name = "";
        int counter = 0;
        for(int i = 1; i <= number; i++){
            System.out.println("Please enter the name of the region number "+i+" : ");
            name = sc.next();
            System.out.println("Please enter the expenditure: ");
            double expenditure = sc.nextDouble();
            System.out.println("Please enter the revenue: ");
            double revenue = sc.nextDouble();
            double profit = expenditure+(expenditure*25/100d);
            if(revenue >= profit){
                counter++;
                System.out.println("Profit region: "+name);
                if(revenue > highest){
                    highest = revenue;
                    name$H = name;
                }
                if(revenue < lowest){
                    lowest = revenue;
                    name$L = name;
                }
            }
            else if(revenue < profit){
                System.out.println("Loss region: "+name);
            }
        }
        if(counter == 0){
            System.out.println("");
        }
        else{
            System.out.println("The highest profitable region is "+name$H+" .");
            System.out.println("The lowest profitable region is "+name$L+" .");
        }
    }
}