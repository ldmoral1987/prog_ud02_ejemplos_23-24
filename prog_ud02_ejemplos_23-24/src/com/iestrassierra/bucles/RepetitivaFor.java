
package com.iestrassierra.bucles;

import java.util.Scanner;

/**
 * Repeticiones con bucle for
 * 
 * @author Luis del Moral MartÌnez
 */
public class RepetitivaFor {

    /**
     * En esta soluciÛ se utiliza la estructura repetitiva for para representar
     * en pantalla la tabla de multiplicar del siete.
     */
    public static void main(String[] args) {
        // DeclaraciÛn e inicializaciÛn de variables
        int numero = 7;
        int contador;
        int resultado = 0;

        /* Paso 1. Mostrar la cabecera de la tabla */
        System.out.println("Tabla de multiplicar del " + numero);
        System.out.println(".............................. ");

        /* Paso 2. Calcular la tabla de multiplicar del 7 usando un bucle for.        
         * La cabecera del bucle incorpora la inicializaci√≥n de la variable
         * de control, la condici√≥n de multiplicaci√≥n hasta el 10 y el
         * incremento de dicha variable de uno en uno en cada iteraci√≥n del bucle. 
         * En este caso contador++ incrementar√° en una unidad el valor de 
         * dicha variable.
         */
        for (contador = 1; contador <= 10; contador++) {
            resultado = contador * numero;
            System.out.println(numero + " x " + contador + " = " + resultado);
        }
        
        /* Nota: A trav√©s del operador + aplicado a cadenas de caracteres,         
         * concatenamos los valores de las variables con las cadenas de
         * caracteres que necesitamos para representar correctamente la
         * salida de cada multiplicaci√≥n.
         */
    }
}
