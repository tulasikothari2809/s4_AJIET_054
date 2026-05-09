import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        if (n <= 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
            System.out.println("INVALID INPUT");
            return;
        }
        int monkeysForBananas = m / k;
        if (m % k != 0) {
            monkeysForBananas++;
        }
        int monkeysForPeanuts = p / j;
        if (p % j != 0) {
            monkeysForPeanuts++;
        }
        int monkeysDown = monkeysForBananas + monkeysForPeanuts;
        int monkeysLeft = n - monkeysDown;
        if (monkeysLeft < 0) {
            monkeysLeft = 0;
        }
        System.out.println("Number of Monkeys left on the tree:" + monkeysLeft);
    }
}
