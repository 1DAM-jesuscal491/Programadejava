package prueba;

import java.util.Scanner;

public class ejercicioexamen2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Pon un numero");
        int num = teclado.nextInt();
        int num1 = num, num_cifras = 0, num2 = 0, num3 = 0;
        while (num > 0) {
            num /= 10;
            num_cifras++;
        }
        System.out.print("Pon un salto");
        int sal = teclado.nextInt();
        if (sal == 1) {
            while (num1 > 0) {
                num2 = num2 * 10;
                num2 += num1 % 10;
                num1 /= 100;
                System.out.println(num2);
            }
        } else if (sal == 2) {
            while (num1 > 0) {
                num2 = num2 * 10;
                num2 += num1 % 10;
                num1 /= 1000;
                System.out.println(num2);
            }
        }
    }
}
