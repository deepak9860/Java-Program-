package variables;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i = i + 1;
        }
    }
}
