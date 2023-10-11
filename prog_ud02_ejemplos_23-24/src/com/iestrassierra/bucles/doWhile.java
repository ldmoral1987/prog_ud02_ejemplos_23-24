
package com.iestrassierra.bucles;

import java.util.Scanner;

/**
 * Uso de do-while
 * 
 * @author Luis del Moral Mart�nez
 */
public class doWhile {

    public static void main(String[] args) {
        // Declaraci�n de variables
        Scanner teclado = new Scanner(System.in);
        int inicio, fin, numero;

        // Entrada de datos
        System.out.print("Introduzca el inicio: ");
        inicio = teclado.nextInt();
        System.out.print("Introduzca el fin: ");
        fin = teclado.nextInt();

        // Procesamiento y salida de resultados
        System.out.println("\nSecuencia de n�meros desde " + inicio + " hasta " + fin);
        numero = inicio;
        do {
            System.out.print(numero + " ");
            numero++;
        } while (numero <= fin);
        
        System.out.println();
    }
}
