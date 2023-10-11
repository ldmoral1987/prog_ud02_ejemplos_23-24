
package com.iestrassierra.bucles;

import java.util.Scanner;

/**
 * Repeticiones con bucle for
 * 
 * @author Luis del Moral Mart�nez
 */
public class RepetitivaFor {

    /**
     * En esta soluci� se utiliza la estructura repetitiva for para representar
     * en pantalla la tabla de multiplicar del siete.
     */
    public static void main(String[] args) {
        // Declaraci�n e inicializaci�n de variables
        int numero = 7;
        int contador;
        int resultado = 0;

        /* Paso 1. Mostrar la cabecera de la tabla */
        System.out.println("Tabla de multiplicar del " + numero);
        System.out.println(".............................. ");

        /* Paso 2. Calcular la tabla de multiplicar del 7 usando un bucle for.        
         * La cabecera del bucle incorpora la inicialización de la variable
         * de control, la condición de multiplicación hasta el 10 y el
         * incremento de dicha variable de uno en uno en cada iteración del bucle. 
         * En este caso contador++ incrementará en una unidad el valor de 
         * dicha variable.
         */
        for (contador = 1; contador <= 10; contador++) {
            resultado = contador * numero;
            System.out.println(numero + " x " + contador + " = " + resultado);
        }
        
        /* Nota: A través del operador + aplicado a cadenas de caracteres,         
         * concatenamos los valores de las variables con las cadenas de
         * caracteres que necesitamos para representar correctamente la
         * salida de cada multiplicación.
         */
    }
}
