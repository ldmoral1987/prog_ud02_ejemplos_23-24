
package com.iestrassierra.bucles;

/**
 * Aplicaci�n bucle acumulador para suma
 * 
 * @author Luis del Moral Mart�nez
 */
public class AcumulaSuma {

    public static void main(String[] args) {
        // Declaraci�n de variables
        int contador; // Contador que ir� desde inicio (1) hasta fin (5)
        int suma;     // Acumulador que ir� sumando de manera consecutiva los distintos valores que vaya tomando del contador

        // Iniciamos contadores
        contador = 1; // Iniciamos el contador a 1
        suma = 0;     // Iniciamos el acumulador a 0, para ir sumando todo lo que se vaya recorriendo

        // Realizamos el recorrido
        while (contador <= 5) {  // Mientras contador no supere el valor 5...
            suma += contador; // En cada iteraci�n cumulamos en suma el valor de cada contador
            contador++;       // En cada iteraci�n incrementamos en 1 el contador 
        }

        // Mostramos el resultado por pantalla
        System.out.println("La suma de los n�meros entre 1 y 5 es " + suma);
    }
}
