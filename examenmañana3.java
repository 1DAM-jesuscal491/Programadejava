package prueba;

import java.util.Scanner;

public class examenmañana3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Pon el numeros");
        int num1 = teclado.nextInt();
        int num2 = num1 % 10;
        num1 /= 10;
        int num3 = num1 % 10;
        num1 /= 10;
        int numr1 = 0, numr2 = 0, numr3 = 0;
        int p = num1, s = num2, t = num3;
        int u1 = 0, u2 = 0, u3 = 0;
        int d1 = 0, d2 = 0, d3 = 0;
        int c1 = 0, c2 = 0, c3 = 0;
        int m1 = 0, m2 = 0, m3 = 0;
        while (num1 > 0) {
            numr1 = (int) (Math.random() * (10000 - 1000 + 10000));
            num1 /= 10;
        }
        while (num2 > 0) {
            numr2 = (int) (Math.random() * (10000 - 1000 + 10000));
            num2 /= 10;
        }
        while (num3 > 0) {
            numr3 = (int) (Math.random() * (10000 - 1000 + 10000));
            num3 /= 10;
        }
        while (numr1 > 0) {
            u1 = numr1 % 10;
            numr1 /= 10;
            d1 = numr1 % 10;
            numr1 /= 10;
            c1 = numr1 % 10;
            numr1 /= 10;
            m1 = numr1 % 10;
            numr1 /= 10;
        }
        while (numr2 > 0) {
            u2 = numr2 % 10;
            numr2 /= 10;
            d2 = numr2 % 10;
            numr2 /= 10;
            c2 = numr2 % 10;
            numr2 /= 10;
            m1 = numr2 % 10;
            numr2 /= 10;
        }
        while (numr3 > 0) {
            u3 = numr3 % 10;
            numr3 /= 10;
            d3 = numr3 % 10;
            numr3 /= 10;
            c3 = numr3 % 10;
            numr3 /= 10;
            m3 = numr3 % 10;
            numr3 /= 10;
        }
        int total1 = p + u1 + d1 + c1 + m1;
        int total2 = s + u2 + d2 + c2 + m2;
        int total3 = t + u3 + d3 + c3 + m3;
        System.out.println("De la primera clave" + total1);
        System.out.println("De la segunda clave" + total2);
        System.out.println("De la tercera clave" + total3);
        System.out.println(total1 + total2 + total3);
    }
}
