package prueba;

import java.util.Scanner;

public class ejerciciodec {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Pon la altura");
        int alt = teclado.nextInt();
        if (alt > 3 && alt % 2 == 1) {
            for (int y = 0; y < alt; y++) {
                for (int x = 0; x < alt; x++) {
                    if (y == 0 || y == alt - 1 || x == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
