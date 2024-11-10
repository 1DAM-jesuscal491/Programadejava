package prueba;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int numint = 0; numint < 3; numint++) {
            System.out.print("El primer numero");
            int num = teclado.nextInt();
            System.out.print("El segundo numero");
            int num2 = teclado.nextInt();
            System.out.print("El tercero numero");
            int num3 = teclado.nextInt();
            int numl = (int) (Math.random() * (99999 - 1));
            if (((numl % 10) == num) || ((numl % 10) == num2) || (((numl % 10) == num3) && ((numl % 100) == num)) || ((numl % 100) == num2) || (((numl % 100) == num3) && ((numl % 1000) == num)) || ((numl % 1000) == num2) || (((numl % 1000) == num3) && ((numl % 10000) == num) || ((numl % 10000) == num2)) || ((numl % 10000) == num3)) {
                System.out.println("Tiene suerte" + numl);
            } else {
                System.out.println("No tiene suerte" + numl);
            }
        }
    }
}


