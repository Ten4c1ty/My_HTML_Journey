import java.util.Scanner;
public class AirportPassengerTimeCountIncomplete{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total number of gates: ");
        int gates = sc.nextInt();
        int passengers = 0;
        double BoardingTime = 0;
        int TotalPassengers = 0;
        double Total = 0;
        double totaleachgate = 0;
        int totalpassengersflight = 0;
        for(int i = 1; i <= gates; i++){
            System.out.println("Please enter the total number of flights for gate number "+i+" : ");
            int flights = sc.nextInt();
            for(int j = 1; j <= flights; j++){
                System.out.println("Please enter the total number of passengers for flight number "+j+" : ");
                passengers = sc.nextInt();
                System.out.println("Please enter the average boarding time per passenger for flight number "+j+" : ");
                BoardingTime = sc.nextInt();
                totaleachgate = (passengers*BoardingTime)+totaleachgate;
                totalpassengersflight += passengers;
            }
            TotalPassengers += totalpassengersflight;
            Total += totaleachgate;
            System.out.println("The total boarding time for gate number "+i+" is "+totaleachgate+".");
            System.out.println("The average boarding time per passenger for gate number "+i+" is "+(totaleachgate/totalpassengersflight)+".");
            totaleachgate = 0;
            totalpassengersflight = 0;
        }
        System.out.println("The total boarding time for all gates is "+(Total*gates)+".");
        System.out.println("The average boarding time per passenger for all gates is "+(Total*gates/TotalPassengers)+".");
    }
}