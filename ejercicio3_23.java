package prueba;

import java.util.Scanner;

public class ejercicio3_23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int compra = 0; compra < 26; compra++) {
            System.out.print("Cuanto tickek son:");
            float nume = teclado.nextFloat();
            System.out.println(" Numero de entrada" + nume);
            System.out.print("Cuanto dia son:");
            int dia = teclado.nextInt();
            System.out.println(" El dia de nuestro señor" + dia);
            System.out.print("Si del grupo es 1 sino es 0");
            int grupo = teclado.nextInt();
            System.out.println("grupo 1 si 0 no" + grupo);
            if (dia == 3) {
                if (grupo == 1) {
                    System.out.println("El precio es de 5");
                    float precio = nume * 5;
                    System.out.println("El precio:" + precio);
                    float descuento = (float) (precio * 0.10);
                    System.out.println("El descuento" + descuento);
                    float preciot = precio - descuento;
                    System.out.println("El precio final" + preciot);
                } else {
                    System.out.println("El precio es de 5");
                    float precio = nume * 5;
                    System.out.println("El precio:" + precio);
                    float descuento = 0;
                    System.out.println("El descuento" + descuento);
                    float preciot = precio - descuento;
                    System.out.println("El precio final" + preciot);
                }
            } else if (dia == 4) {
                if (grupo == 1) {
                    System.out.println("El precio es de 11 en grupo");
                    float nume2 = nume / 2;
                    nume = nume % 2;
                    float precio = nume * 8 + nume2 * 11;
                    System.out.println("El precio:" + precio);
                    float descuento = (float) (precio * 0.10);
                    System.out.println("El descuento" + descuento);
                    float preciot = precio - descuento;
                    System.out.println("El precio final" + preciot);
                } else {
                    System.out.println("El precio es de 11 en grupo");
                    float nume2 = nume / 2;
                    nume = nume % 2;
                    float precio = nume * 8 + nume2 * 11;
                    System.out.println("El precio:" + precio);
                    float descuento = 0;
                    System.out.println("El descuento" + descuento);
                    float preciot = precio - descuento;
                    System.out.println("El precio final" + preciot);
                }
            } else {
                if (grupo == 1) {
                    System.out.println("El precio es de 8");
                    float precio = nume * 8;
                    System.out.println("El precio:" + precio);
                    float descuento = (float) (precio * 0.10);
                    System.out.println("El descuento" + descuento);
                    float preciot = precio - descuento;
                    System.out.println("El precio final" + preciot);
                } else {
                    System.out.println("El precio es de 8");
                    float precio = nume * 8;
                    System.out.println("El precio:" + precio);
                    float descuento = 0;
                    System.out.println("El descuento" + descuento);
                    float preciot = precio - descuento;
                    System.out.println("El precio final" + preciot);
                }
            }
        }
    }
}
