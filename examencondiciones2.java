package prueba;

import java.util.Scanner;

public class examencondiciones2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean esprimo = true;
        int nd = 2, numnum = 0, num2 = 0, media = 0, nd2 = 0;
        int nummax = 0, nummin = 300;
        do {
            System.out.print("el  numero es primo");
            int num1 = teclado.nextInt();
            esprimo = true;
            while (num1 - 1 > nd) {
                if (num1 % nd == 0) {
                    esprimo = false;
                    break;
                }
                nd++;
            }
            numnum++;

            if (num1 > nummax) {
                nummax = num1;
            }
            if (num1 < nummin) {
                nummin = num1;
            }
            num2 += num1;
            nd2++;
            media = num2 / nd2;
        } while (!esprimo);
        System.out.println(nummax);
        System.out.println(nummin);
        System.out.println(media);
    }
}
