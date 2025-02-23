package variables;

import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        do {
            System.out.println(i);
            i = i + 1 ;
        }while (i < 11 );
    }
}
