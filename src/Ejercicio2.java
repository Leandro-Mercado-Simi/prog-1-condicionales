/*
 Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
15% para jubilados. Imprime el precio final después del descuento.*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String categoria = "";
        double descuento = 0, precio, precioConDescuento;

        System.out.print("Ingrese el precio del producto: ");
        precio = s.nextDouble();
        s.nextLine();

        System.out.print("Ingrese su categoría de cliente: ");
        categoria = s.nextLine().toLowerCase();

        System.out.println("----------------------------------------");

        switch (categoria) {
            case "estudiante":
                descuento = 10;
                break;
            case "adulto":
                descuento = 5;
                break;
            case "jubilado":
                descuento = 15;

                break;
            default:
                System.out.println("Categoría ingresada no válida");
        }
        precioConDescuento = precio * (1 - descuento / 100);
        System.out.println("El precio final aplicando su descuento de " + categoria + " es de: $" + precioConDescuento);
        System.out.println("----------------------------------------");


    }
}
