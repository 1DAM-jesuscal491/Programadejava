package prueba;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Pon la hora");
        int h = teclado.nextInt();
        System.out.print("Pon el minuto");
        int m = teclado.nextInt();
        System.out.print("Pon el segundo");
        int s = teclado.nextInt();
        for (int sp = 0; sp < 10; sp++) {
            if (s == 60) {
                m++;
                s = 0;
                System.out.println(h + ":" + m + ":" + s);
            } else if (m == 60) {
                h++;
                m = 0;
                System.out.println(h + ":" + m + ":" + s);
            } else {
                s++;
                System.out.println(h + ":" + m + ":" + s);
            }

        }
    }
}
