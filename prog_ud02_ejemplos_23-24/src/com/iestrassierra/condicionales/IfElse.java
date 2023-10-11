
package com.iestrassierra.condicionales;

import java.util.Scanner;

/**
 * Uso de sentencias if-else
 * 
 * @author Luis del Moral Mart�nez
 */
public class IfElse {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.print("Introduzca un n�mero entero: ");
        numero = teclado.nextInt(); // Lectura de un entero desde teclado
        if (numero > 0) {
            System.out.println("El n�mero es positivo.");
        } else {
            System.out.println("El n�mero no es positivo.");
        }

        if (numero % 2 == 0) {  // Si el resto de la divisi�n entera entre 2 es cero, el n�mero es par
            System.out.println("El n�mero es par.");
        } else { // Si no, el n�mero es impar
            System.out.println("El n�mero es impar.");
        }

        // Declaraci�n de variables
        double calificacionNumerica;               // Variable de entrada
        String calificacionCualitativa = "SUSPENSO"; // Variable de salida

        // Entrada de datos
        System.out.print("Introduzca la calificaci�n (entre 0.0 y 10.0): ");
        calificacionNumerica = teclado.nextDouble();

        // Procesamiento
        if (calificacionNumerica >= 5) {
            calificacionCualitativa = "APROBADO";
        } else {
            calificacionCualitativa = "SUSPENSO";
        }

        // Salida de resultados
        System.out.println(calificacionCualitativa);

    }

}
