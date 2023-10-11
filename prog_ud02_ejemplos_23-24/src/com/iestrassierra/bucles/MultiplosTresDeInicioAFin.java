
package com.iestrassierra.bucles;

import java.util.Scanner;

/**
 * Aplicaci�n m�ltiplos de 3 (suma todos los m�ltiplos de 3)
 * 
 * @author Luis del Moral Mart�nez
 */
public class MultiplosTresDeInicioAFin {

    public static void main(String[] args) {
        // Declaraci�n de variables
        // ------------------------
        Scanner teclado = new Scanner(System.in);
        int inicio, fin;    // Entradas
        int contador;       // contador
        int sumaMultiplos3; // acumulador

        // Entrada de datos
        // ----------------
        System.out.print("Introduzca el inicio: ");
        inicio = teclado.nextInt();
        System.out.print("Introduzca el fin: ");
        fin = teclado.nextInt();

        // Procesamiento
        // -------------
        contador = inicio;  // Iniciamos contador
        sumaMultiplos3 = 0;  // Iniciamos acumulador
        
        // Recorremos n�meros desde inicio hasta fin
        while (contador <= fin) {
            if (contador % 3 == 0) // Si alguno es m�ltiplo de 3, lo sumamos al acumulador (lo "acumulamos")
            {
                sumaMultiplos3 += contador;
            }
            contador++;  // Incrementamos el contador que va desde inicio hasta fin
        }

        // Salida de resultados
        // --------------------
        System.out.println("La suma de los m�ltiplos de 3 entre " + inicio + " y " + fin + " es " + sumaMultiplos3 + ".");
        System.out.println();
    }
}
