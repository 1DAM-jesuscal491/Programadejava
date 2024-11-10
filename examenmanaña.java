package prueba;

import java.util.Scanner;

public class examenmanaña {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("La altura: ");
        int alt = teclado.nextInt();
        if (alt % 2 == 1) {
            int alt2y = alt * 2;
            for (int y = 0; y < alt; y++) {
                for (int x = 0; x < alt2y; x++) {
                    if (x + y == alt - 1 || (x > alt2y / 2 && x == y + alt) || y == alt - 3 && (x > 1 && x < alt2y - 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                int alt2 = alt * 2 + 1;
                System.out.print("  ");
                for (int x2 = alt + 1; x2 < alt2; x2++) {
                    if (y <= alt - 1 && (x2 == alt + 1) || y == 0 || y == alt - 4 || y == alt - 1 || y <= alt - 1 && x2 == alt2 - 1) {
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
