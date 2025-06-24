import java.util.*;

public class reverseinteger {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        scn.close();
        int n = 0, r = 0;
        while (x != 0) {
            n = x % 10;
            x = x / 10;

            // Overflow check
            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && n > 7)) {
                System.out.println("Overflow! Reversed integer too big.");
                return;
            }

            // Underflow check
            if (r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && n < -8)) {
                System.out.println("Underflow! Reversed integer too small.");
                return;
            }

            r = r * 10 + n;
        }

        System.out.println("Reversed is: " + r);
    }
}
