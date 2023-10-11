
package com.iestrassierra.condicionales;

import java.util.Scanner;

/**
 * Uso de sentencias if-else
 * 
 * @author Luis del Moral Martínez
 */
public class IfElse {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.print("Introduzca un número entero: ");
        numero = teclado.nextInt(); // Lectura de un entero desde teclado
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número no es positivo.");
        }

        if (numero % 2 == 0) {  // Si el resto de la división entera entre 2 es cero, el número es par
            System.out.println("El número es par.");
        } else { // Si no, el número es impar
            System.out.println("El número es impar.");
        }

        // Declaración de variables
        double calificacionNumerica;               // Variable de entrada
        String calificacionCualitativa = "SUSPENSO"; // Variable de salida

        // Entrada de datos
        System.out.print("Introduzca la calificación (entre 0.0 y 10.0): ");
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
