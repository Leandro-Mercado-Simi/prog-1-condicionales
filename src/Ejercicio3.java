/*
Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
ciencia ficción) y luego recomiende un libro basado en su elección.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String genero = "";

        System.out.print("Ingrese su género literario favorito para obtener una recomendación: ");
        genero = s.nextLine().toLowerCase();

        System.out.println("----------------------------------------");
        switch (genero) {
            case "fantasia":
                System.out.println("Recomendación: El Hobbit - J.R.R Tolkien");
                break;
            case "misterio":
                System.out.println("Recomendación: Miedo Mortal - Robin Cook");
                break;
            case "romance":
                System.out.println("Recomendación: El amor en tiempos del cólera - Gabriel García Márquez");
                break;
            case "ciencia ficción":
                System.out.println("Recomendación: 1984 - George Orwell");
                break;
            default:
                System.out.println("Género ingresado no encontrado");
        }
        System.out.println("----------------------------------------");

    }
}
