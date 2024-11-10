package prueba;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Pon un numero de seis");
        int num1 = teclado.nextInt();
        int num2 = 0, dig = 0;
        while (num1 > 0) {
            if (num1 % 10 != 8 && num1 % 10 != 0) {
                num2 = num2 * 10;
                num2 += num1 % 10;
            } else {
                dig++;
            }
            num1 /= 10;
            System.out.println("De vuelta" + num2 + " Digitos eliminado " + dig);
        }
    }
}
