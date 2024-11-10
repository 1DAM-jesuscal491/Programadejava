package prueba;

import java.util.Scanner;

public class examencondiciones1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Pon un numero");
        long num = teclado.nextInt();
        long num1 = num, num_cifras = 0;
        while (num > 0) {
            num /= 10;
            num_cifras++;
        }
        while (num1 > 0) {
            int num2 = (int) (num1 % 10);
            num1 /= 10;
            switch (num2) {
                case 0:
                    System.out.print("Este es el numero" + num2);
                    break;
                case 1:
                    System.out.print("Este es el numero" + num2);
                    break;
                case 2:
                    System.out.print("Este es el numero" + num2);
                    break;
                case 3:
                    System.out.print("Este es el numero" + num2);
                    break;
                case 4:
                    System.out.print("Este es el numero" + num2);
                    break;
                case 5:
                    System.out.print("Este es el numero" + num2);
                    break;
                case 6:
                    System.out.print("Este es el numero" + num2);
                    break;
                case 7:
                    System.out.print("Este es el numero" + num2);
                    break;
                case 8:
                    System.out.print("Este es el numero" + num2);
                    break;
                case 9:
                    System.out.print("Este es el numero" + num2);
                    break;
            }
            num_cifras--;
        }
    }
}
