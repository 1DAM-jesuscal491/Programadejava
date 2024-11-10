package prueba;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Pon la altura:");
        int numa = teclado.nextInt();
        if (numa >= 4) {
            int numb = numa * 2;
            for (int y = 0; y < numa; y++) {
                for (int x = 0; x < numb; x++) {
                    if (x <= 2 || y >= numa - 2 && x <= 5) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                    if (x >= 8 && x <= 10 || y >= numa - 2 && x > 9) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}