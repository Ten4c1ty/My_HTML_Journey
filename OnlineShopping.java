import java.util.Scanner;
public class OnlineShopping{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of products purchased: ");
        int products = sc.nextInt();
        double discount = 0;
        double totalDiscount = 0;
        double totalCost = 0;
        for(int i = 1; i<=products; i++){
            System.out.println("Cost of product number "+i+" : ");
            double cost = sc.nextDouble();
            System.out.println("Quantity of product number "+i+" : ");
            int quantity = sc.nextInt();
            System.out.println("Which category is the product of ?");
            System.out.print("Electronics: ");
            boolean electronics = sc.nextBoolean();
            System.out.print("Clothing: ");
            boolean clothing = sc.nextBoolean();
            System.out.print("Others: ");
            boolean others = sc.nextBoolean();
            cost *= quantity;
            totalCost += cost;
            System.out.println("The total cost of product number "+i+" before discounts is "+cost+" .");
            if(quantity > 10){
                discount += cost*10/100;
                cost -= cost*10/100;
            }
            if(electronics){
                discount += cost*5/100;
                cost -= cost*5/100;
            }
            else if(clothing){
                discount += cost*15/100;
                cost -= cost*15/100;
            }
            System.out.println("The total discount is "+discount+" .");
            System.out.println("The total cost after discounts is "+cost+" .");
            totalDiscount += discount;
            discount = 0;
        }
        System.out.println("The total cost of the whole cart before discounts is "+totalCost+" .");
        System.out.println("The total discount of the whole cart is "+totalDiscount+" .");
        System.out.println("The total cost of the whole cart after discounts is "+(totalCost-totalDiscount)+" .");
    }
}