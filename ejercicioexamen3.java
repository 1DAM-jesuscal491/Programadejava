package prueba;

import java.util.Scanner;

public class ejercicioexamen3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Las hambuegesa basica");
        int numb = teclado.nextInt();
        System.out.print("Las hambuegesa gourmet");
        int numg = teclado.nextInt();
        System.out.print("El dia es");
        int dia = teclado.nextInt();
        System.out.print("El grupo");
        boolean grupo = teclado.nextBoolean();
        System.out.println("Esto son los menus basicos:" + numb);
        System.out.println("Esto son los menus gourmet:" + numg);
        System.out.println("Este es el dia:" + dia);
        System.out.println("¿Pertenece al club Fanegas?" + grupo);
        if (dia == 3) {
            if (grupo) {
                System.out.println("Aquí tiene su pedido. Gracias por su compra");
                float preciob = numb * 2;
                System.out.println("Hamburguesas básicas: " + numb);
                float preciog = numg * 5;
                System.out.println("Hamburguesas gourmet: " + numg);
                float preciot = preciob + preciog;
                System.out.println("Total: " + preciot + "€");
                float preciod = preciot * 0.12F;
                System.out.println("Descuento: " + preciod + "€");
                float precioa = preciot - preciod;
                System.out.println("A pagar: " + precioa + "€");
            } else {
                System.out.println("Aquí tiene su pedido. Gracias por su compra");
                float preciob = numb * 2;
                System.out.println("Hamburguesas básicas: " + numb);
                float preciog = numg * 5;
                System.out.println("Hamburguesas gourmet: " + numg);
                float preciot = preciob + preciog;
                System.out.println("Total: " + preciot + "€");
                float preciod = preciot * 0;
                System.out.println("Descuento: " + preciod + "€");
                float precioa = preciot - preciod;
                System.out.println("A pagar: " + precioa + "€");
            }
        } else if (dia == 4) {
            if (grupo) {
                System.out.println("Aquí tiene su pedido. Gracias por su compra");
                float preciob = numb * 3;
                System.out.println("Hamburguesas básicas: " + numb);
                int numgg = numg / 2;
                numg %= 2;
                float preciog = numg * 5 + numgg * 9;
                float preciot = preciob + preciog;
                System.out.println("Total: " + preciot + "€");
                float preciod = preciot * 0.12F;
                System.out.println("Descuento: " + preciod + "€");
                float precioa = preciot - preciod;
                System.out.println("A pagar: " + precioa + "€");
            } else {
                System.out.println("Aquí tiene su pedido. Gracias por su compra");
                float preciob = numb * 3;
                System.out.println("Hamburguesas básicas: " + numb);
                int numgg = numg / 2;
                numg %= 2;
                float preciog = numg * 5 + numgg * 9;
                System.out.println("Hamburguesas gourmet: " + numg);
                float preciot = preciob + preciog;
                System.out.println("Total: " + preciot + "€");
                float preciod = preciot * 0;
                System.out.println("Descuento: " + preciod + "€");
                float precioa = preciot - preciod;
                System.out.println("A pagar: " + precioa + "€");
            }
        } else {
            if (grupo) {
                System.out.println("Aquí tiene su pedido. Gracias por su compra");
                float preciob = numb * 3;
                System.out.println("Hamburguesas básicas: " + numb);
                float preciog = numg * 5;
                System.out.println("Hamburguesas gourmet: " + numg);
                float preciot = preciob + preciog;
                System.out.println("Total: " + preciot + "€");
                float preciod = preciot * 0.12F;
                System.out.println("Descuento: " + preciod + "€");
                float precioa = preciot - preciod;
                System.out.println("A pagar: " + precioa + "€");
            } else {
                System.out.println("Aquí tiene su pedido. Gracias por su compra");
                float preciob = numb * 3;
                System.out.println("Hamburguesas básicas: " + numb);
                float preciog = numg * 5;
                System.out.println("Hamburguesas gourmet: " + numg);
                float preciot = preciob + preciog;
                System.out.println("Total: " + preciot + "€");
                float preciod = preciot * 0;
                System.out.println("Descuento: " + preciod + "€");
                float precioa = preciot - preciod;
                System.out.println("A pagar: " + precioa + "€");
            }
        }
    }
}
