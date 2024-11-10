package prueba;

import java.util.Scanner;

public class examenmañana2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Pon una numero:");
        int num1 = teclado.nextInt();
        int num2 = 0;
        while (num1 > 0) {
            num2 = num1 % 10;
            if (num2 == 1) {
                int num22 = num2;
                System.out.print(num22);
            } else if (num2 == 2) {
                int num23 = num2;
                System.out.print(num23);
            } else if (num2 == 3) {
                int num24 = num2;
                System.out.print(num24);
            } else if (num2 == 4) {
                int num25 = num2;
                System.out.print(num25);
            } else if (num2 == 5) {
                int num26 = num2;
                System.out.print(num26);
            } else if (num2 == 6) {
                int num27 = num2;
                System.out.print(num27);
            } else if (num2 == 7) {
                int num28 = num2;
                System.out.print(num28);
            } else if (num2 == 8) {
                int num29 = num2;
                System.out.print(num29);
            } else if (num2 == 9) {
                int num30 = num2;
                System.out.print(num30);
            }
            num1 /= 10;
        }
    }
}
