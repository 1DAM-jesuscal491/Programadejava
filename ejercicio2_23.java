package prueba;

import java.util.Scanner;

public class ejercicio2_23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Pon una cifra de varios:");
        int numero = teclado.nextInt();
        System.out.print("Pon una cifra");
        int ucifra = teclado.nextInt();
        int cifra = 0, num2 = 0;
        int nd = 10;
        for (int n = 7; n > 0; n--) {
            num2 = numero % nd;
            numero /= 10;
            if (num2 == 1) {
                System.out.println(num2);
                if (num2 == ucifra) {
                    cifra++;
                }
            } else if (num2 == 2) {
                System.out.println(num2);
                if (num2 == ucifra) {
                    cifra++;
                }
            } else if (num2 == 3) {
                System.out.println(num2);
                if (num2 == ucifra) {
                    cifra++;
                }
            } else if (num2 == 4) {
                System.out.println(num2);
                if (num2 == ucifra) {
                    cifra++;
                }
            } else if (num2 == 5) {
                System.out.println(num2);
                if (num2 == ucifra) {
                    cifra++;
                }
            } else if (num2 == 6) {
                System.out.println(num2);
                if (num2 == ucifra) {
                    cifra++;
                }
            } else if (num2 == 7) {
                System.out.println(num2);
                if (num2 == ucifra) {
                    cifra++;
                }
            } else if (num2 == 8) {
                System.out.println(num2);
                if (num2 == ucifra) {
                    cifra++;
                }
            } else if (num2 == 9) {
                System.out.println(num2);
                if (num2 == ucifra) {
                    cifra++;
                }
            }
        }
        if (cifra > 1) {
            System.out.println(cifra + "ocurrancia");
        }
    }
}
