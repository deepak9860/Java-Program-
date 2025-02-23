package variables;

import java.util.Scanner;

public class make_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter an operator(+, -, *, /, %)");
        char operator = sc.next().charAt(0);

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("result:" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("result:" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("result:" + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("result:" + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("result:" + result);
                break;
            default:
                System.out.println("Invaild Operator");
        }
    }
}
