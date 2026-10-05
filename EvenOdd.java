import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
       // Print if Number is Odd or Even
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
       int num = sc.nextInt();
       
       if ( num % 2 == 0 ) {
        System.out.println("EVEN");
       } else {
        System.out.println("ODD");
       }
    }
}
