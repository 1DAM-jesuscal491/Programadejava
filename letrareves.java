package prueba;

import java.util.Scanner;

public class letrareves {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Indica una palabra");
        String palabra = teclado.next();

        int palabla_n = palabra.length() - 1;

        String total = palabra;
        while (palabla_n > 0) {
            System.out.println();
            if (palabla_n == 1) {
                System.out.print("     " + palabra);
            } else if (palabla_n == 2) {
                System.out.print("   " + palabra + total);
            } else if (palabla_n == 3) {
                System.out.print(total + palabra + total);
            } else if (palabla_n == 4) {
                System.out.print("   " + palabra + total);
            } else if (palabla_n == 5) {
                System.out.print("     " + palabra);
            }
            palabla_n--;
        }

    }
}
