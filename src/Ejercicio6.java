/*
Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
hábitos saludables basada en estos datos.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double horasSueno = 0;
        double horasEjercicio = 0;
        int comidas = 0;
        double puntajeSueno, puntajeEjercicio, puntajeComidas, puntajeTotal;


        System.out.println("Evaluador de Hábitos Saludables");
        System.out.print("Cuántas horas duerme por día: ");
        horasSueno = s.nextDouble();

        System.out.print("Cuántas horas al día hace ejercicio: ");
        horasEjercicio = s.nextDouble();

        System.out.print("Cuántas comidas saludables consume al día: ");
        comidas = s.nextInt();

        if (horasSueno >= 7 && horasSueno <= 9) {
            puntajeSueno = 10;
        } else
            puntajeSueno = 5;

        if (horasEjercicio >= 0.5) {
            puntajeEjercicio = 10;
        } else if (horasEjercicio > 0) {
            puntajeEjercicio = 5;
        } else
            puntajeEjercicio = 0;

        if (comidas >= 3) {
            puntajeComidas = 10;
        } else if (comidas >= 1) {
            puntajeComidas = 5;
        } else {
            puntajeComidas = 0;
        }

        puntajeTotal = (puntajeSueno + puntajeEjercicio + puntajeComidas) / 3;
        System.out.println("----------------------------------------");
        System.out.println("El puntaje total de hábitos saludables obtenido es de: " + df.format(puntajeTotal) + "/(10)");

        if (puntajeSueno != 10) {
            System.out.println("Debería considerar mejorar sus horas de sueño");
        }

        if (puntajeEjercicio == 5) {
            System.out.println("Debería considerar ejercitarse un poco más");
        } else if (puntajeEjercicio < 5) {
            System.out.println("Debería considerar comenzar a hacer ejercicio");
        }

        if (puntajeComidas == 5) {
            System.out.println("Debería considerar incorporar más comidas saludables a su dieta diaria");
        } else if (puntajeComidas < 5) {
            System.out.println("Debería comenzar a consumir comidas más saludables");
        }

        System.out.println("----------------------------------------");

    }
}
