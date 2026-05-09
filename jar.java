import java.util.Scanner;
public class CandyJar {
    public static void main(String[] args) {
        int N = 10; 
        int K = 5;  
        int candiesAvailable = N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of candies to buy: ");
        int input = sc.nextInt();
        if (input > candiesAvailable || candiesAvailable - input < K) {
            System.out.println("INVALID INPUT");
        } else {
            candiesAvailable = candiesAvailable - input;
            System.out.println("Number of Candies Sold: " + input);
            System.out.println("Number of Candies available: " + candiesAvailable);
            if (candiesAvailable == K) {
                candiesAvailable = N;
                System.out.println("Jar refilled");
                System.out.println("Candies available after refill: " + candiesAvailable);
            }
        }
        sc.close();
    }
}
