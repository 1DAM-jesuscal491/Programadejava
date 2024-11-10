package prueba;

import java.util.Scanner;

public class ejercicio1_23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Pon la altura");
        int alt = teclado.nextInt();
        if (alt > 4) {
            int alt2 = alt * 2;
            int alto = 0, bajo = 0;
            while (alto < alt2) {
                if (alto == alt2 / 2) {
                    System.out.print(" ");
                }
                System.out.print("x");
                alto++;
            }
            for (int y = 0; y < alt; y++) {
                for (int x = 0; x < alt2 + 1; x++) {
                    if (x + y == alt - 1 || x + y == alt2) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            while (bajo < alt2) {
                if (bajo == alt2 / 2) {
                    System.out.print(" ");
                }
                System.out.print("x");
                bajo++;
            }
        }
    }
}
