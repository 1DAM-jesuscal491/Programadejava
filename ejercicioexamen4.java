package prueba;

import java.util.Scanner;

public class ejercicioexamen4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Pon un numero");
        int num = teclado.nextInt();
        int num1 = num, num2 = 0, num_cifras = 0, nd = 2, nd2 = 2;
        while (num > 0) {
            num /= 10;
            num_cifras++;
        }
        boolean esprimo = true, esprimo2 = true;
        if (num_cifras % 3 == 0) {
            num2 = (int) (num1 % Math.pow(10, num_cifras / 2));
            num1 /= Math.pow(10, num_cifras / 2);
            while (num1 - 1 > nd) {
                if (num1 % nd == 0) {
                    esprimo = false;
                    break;
                }
                nd++;
            }
            while (num2 - 1 > nd2) {
                if (num2 % nd2 == 0) {
                    esprimo2 = false;
                    break;
                }
                nd2++;
            }
        }
        if (esprimo) {
            System.out.println("Es primo" + num1);
        } else {
            System.out.println("No es primo" + num1);
        }
        if (esprimo2) {
            System.out.println("Es primo" + num2);
        } else {
            System.out.println("No es primo" + num2);
        }
    }
}
