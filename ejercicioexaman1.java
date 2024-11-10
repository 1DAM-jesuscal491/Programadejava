package prueba;

import java.util.Scanner;

public class ejercicioexaman1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("La altura:");
        int alt = teclado.nextInt();
        if (alt % 2 != 0) {
            for (int y = 0; y < alt; y++) {
                for (int x = 0; x < alt; x++) {
                    if (x == 0 || x == alt - 1 || y <= alt / 2 && (x + y == alt - 1 || x == y)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");
                for (int x3 = 0; x3 < alt; x3++) {
                    if (x3 == alt / 2 && y > alt / 2 || y <= alt / 2 && (x3 + y == alt - 1 || x3 == y)) {
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
