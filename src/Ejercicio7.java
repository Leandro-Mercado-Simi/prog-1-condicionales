/*
Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
recomiende una actividad basada en su estado de ánimo.
*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String estado = "";

        System.out.print("Ingrese su estado de ánimo: ");
        estado = s.nextLine().toLowerCase();

        switch (estado) {
            case "feliz":
                System.out.println("Actividad recomendada: Reunirse con amigos o familiares");
                break;
            case "triste":
                System.out.println("Actividad recomendada: Salir a caminar");
                break;
            case "enérgico":
                System.out.println("Actividad recomendada: Hacer ejercicio");
                break;
            case "relajado":
                System.out.println("Actividad recomendada: Leer un libro");
                break;
            default:
                System.out.println("No puedo recomendar una actividad");
        }

    }
}
