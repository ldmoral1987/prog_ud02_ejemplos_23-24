
package com.iestrassierra.condicionales;

import java.util.Scanner;

/**
 * Aplicación para probar si un número es par
 * 
 * @author Luis del Moral Martínez
 */
public class IfNumeroPar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Introduzca un número entero: ");
        numero = teclado.nextInt();

        // Segunda parte: procesamiento (comprobación) y salida de resultados (mensaje por pantalla si es par)
        if (numero % 2 == 0) {  // Si el resto de la divisiÃ³n entera entre 2 es cero, el número es par
            System.out.println("El número es par.");
        }
        
        if ( numero % 2 == 0 ) 
            if ( numero > 100 ) 
                System.out.println ("El número es par y superior a 100.");
    }
}
