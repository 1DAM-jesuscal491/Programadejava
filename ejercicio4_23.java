package prueba;

import java.util.Scanner;

public class ejercicio4_23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pon un numero");
        int numero = teclado.nextInt();
        int num_cifras = 0, nd = 2, nd2 = 2;
        int numero1 = numero;
        while (numero > 0) {
            numero /= 10;
            num_cifras++;
        }
        if (num_cifras % 2 == 0) {
            int numero2 = (int) (numero1 % Math.pow(10, num_cifras / 2));
            numero1 /= Math.pow(10, num_cifras / 2);
            boolean esprimo = true;
            while (numero1 -1> nd ) {
                if (numero1 % nd == 0) {
                    esprimo = false;
                    break;
                }
                nd++;
            }
            if (esprimo == true) {
                System.out.println("Es primo" + numero1);
            } else {
                System.out.println("No es primo" + numero1);
            }
            boolean esprimo2 = true;
            while (numero2 - 1> nd2 ) {
                if (numero2 % nd2 == 0) {
                    esprimo2 = false;
                    break;
                }
                nd2++;
            }
            if (esprimo2 == true) {
                System.out.println("Es primo" + numero2);
            } else {
                System.out.println("No es primo" + numero2);
            }
        }
    }
}
