import java.util.Scanner;
public class libraryShelves{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total number of books: ");
        int n = sc.nextInt();
        System.out.println("Please enter the row capacity of each shelf: ");
        int k = sc.nextInt();
        int shelf = 0;
        int books = n;
        while(books>0){
            books -= k;
            shelf++;
        }
        int extra = shelf/2;
        System.out.println("The total number of shelves needed are "+(shelf+extra));
        System.out.println("The total number of books in the last non-empty shelf are "+(n-(k*(shelf-1))));
    }
}