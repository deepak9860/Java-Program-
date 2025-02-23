package variables;

import java.util.Scanner;

public class PrimeOrnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");
        int x = sc.nextInt();
        if (x % 2 != 0)
        {
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
