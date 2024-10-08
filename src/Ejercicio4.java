/*
Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
peso, peso normal, sobrepeso, obesidad).
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double peso = 0;
        double altura = 0;
        double imc = 0;

        System.out.print("Ingrese su peso en kilogramos: ");
        peso = s.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        altura = s.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("----------------------------------------");

        if (imc < 18.5) {
            System.out.println("Su Indice de Masa Corporal está dentro de los valores de: Bajo Peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Su Indice de Masa Corporal está dentro de los valores de: Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Su Indice de Masa Corporal está dentro de los valores de: Sobrepeso");
        } else if (imc > 30) {
            System.out.println("Su Indice de Masa Corporal está dentro de los valores de: Obesidad");
        }

        System.out.println("----------------------------------------");

    }
}
