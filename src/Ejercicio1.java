/*
Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
ciencia ficción) y luego recomiende una película basada en su elección.
* */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String genero = "";

        System.out.print("Ingrese su género de películas favorito: ");
        genero = s.nextLine().toLowerCase();

        System.out.println("----------------------------------------");
        switch (genero) {
            case "acción":
                System.out.println("Recomendación: John Wick 4");
                break;
            case "comedia":
                System.out.println("Recomendación: Mi villano favorito 4");
                break;
            case "drama":
                System.out.println("Recomendación: Parasite");
                break;
            case "ciencia ficción":
                System.out.println("Recomendación: DUNE");
                break;
            case "terror":
                System.out.println("Recomendación: Midsommar");
                break;
            default:
                System.out.println("No se ha podido encontrar el género ingresado");
        }
        System.out.println("----------------------------------------");

    }
}
