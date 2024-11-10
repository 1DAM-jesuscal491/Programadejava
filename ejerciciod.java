package prueba;

import java.util.Scanner;

public class ejerciciod {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Pon un altura");
        int alt = teclado.nextInt();
        if (alt > 3 && alt % 2 == 1) {
            for (int y = 0; y < alt; y++) {
                for (int x = 0; x < alt; x++) {
                    if (y == 0 && x < alt - 2 || y == alt - 1 && x < alt - 2 || x == 0 || x == alt - 1 && (y > 1 && y < alt - 2) || x == alt - 2 && (y == 1 || y == alt - 2)) {
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
