package variables;

import java.util.Scanner;

public class print_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your table number:");
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++)
        {
            System.out.println(n * i );
        }


    }
}
