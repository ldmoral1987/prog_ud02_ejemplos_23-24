
package com.iestrassierra.condicionales;

import java.util.Scanner;

/**
 * Aplicaci�n para probar si un n�mero es par
 * 
 * @author Luis del Moral Mart�nez
 */
public class IfNumeroPar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Introduzca un n�mero entero: ");
        numero = teclado.nextInt();

        // Segunda parte: procesamiento (comprobaci�n) y salida de resultados (mensaje por pantalla si es par)
        if (numero % 2 == 0) {  // Si el resto de la división entera entre 2 es cero, el n�mero es par
            System.out.println("El n�mero es par.");
        }
        
        if ( numero % 2 == 0 ) 
            if ( numero > 100 ) 
                System.out.println ("El n�mero es par y superior a 100.");
    }
}
