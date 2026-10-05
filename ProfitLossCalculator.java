import java.util.*;

public class ProfitLossCalculator {
    public static void main (String[] args) {
        // Profit and Loss Program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Selling Price: ");
        int sp = sc.nextInt();
        System.out.println("Enter Cost Price: ");
        int cp = sc.nextInt();
        if ( sp > cp ) {
            int profit = sp - cp;
            System.out.println("Profit: " + profit);
        } else if (cp < sp ) {
            int loss = cp - sp;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}
