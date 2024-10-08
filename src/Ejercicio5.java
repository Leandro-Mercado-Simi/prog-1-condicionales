/*
Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
elige una opción al azar y determina quién gana. Imprime el resultado del juego.
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int seleccion = 0;
        int seleccionAleatoria = (int) (Math.random() * 3) + 1;

        do {
            System.out.println("----------------------------------------");
            System.out.println("1) Piedra");
            System.out.println("2) Papel");
            System.out.println("3) Tijera");
            System.out.println("4) Salir");
            System.out.println("Seleccione una opción: ");
            System.out.println("----------------------------------------");
            seleccion = s.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("Usted eligió: Piedra ");
                    if (seleccionAleatoria == 1) {
                        System.out.println("Yo elijo: Piedra");
                        System.out.println("Empate");
                        break;
                    } else if (seleccionAleatoria == 2) {
                        System.out.println("Yo elijo: Papel");
                        System.out.println("Gano yo");
                        break;
                    } else {
                        System.out.println("Yo elijo: Tijera");
                        System.out.println("Gana usted");
                        break;
                    }
                case 2:
                    System.out.println("Usted eligió: Papel");
                    if (seleccionAleatoria == 1) {
                        System.out.println("Yo elijo: Piedra");
                        System.out.println("Gana usted");
                        break;
                    } else if (seleccionAleatoria == 2) {
                        System.out.println("Yo elijo: Papel");
                        System.out.println("Empate");
                        break;
                    } else {
                        System.out.println("Yo elijo: Tijera");
                        System.out.println("Gano yo");
                        break;
                    }
                case 3:
                    System.out.println("Usted eligió: tijera");
                    if (seleccionAleatoria == 1) {
                        System.out.println("Yo elijo: Piedra");
                        System.out.println("Gano yo");
                        break;
                    } else if (seleccionAleatoria == 2) {
                        System.out.println("Yo elijo: Papel");
                        System.out.println("Gana usted");
                        break;
                    } else {
                        System.out.println("Yo elijo: Tijera");
                        System.out.println("Empate");
                        break;
                    }
                case 4:
                    break;
                default:
                    System.out.println("Su elección no pudo ser procesada");
                    break;
            }
        } while (seleccion != 4);

    }
}
