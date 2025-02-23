package variables;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int FirstNum = input.nextInt();
        System.out.println("Enter Second number:");
        int SecondNum = input.nextInt();

        int sum = FirstNum + SecondNum;
        System.out.println("sum of your number is:" + sum);



    }
}
