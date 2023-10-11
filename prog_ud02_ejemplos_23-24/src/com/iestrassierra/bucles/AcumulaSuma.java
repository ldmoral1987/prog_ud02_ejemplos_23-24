/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author luisnavarro
 */
public class AcumulaSuma {

    public static void main(String[] args) {
        // Declaración de variables
        int contador; // Contador que irá desde inicio (1) hasta fin (5)
        int suma;     // Acumulador que irá sumando de manera consecutiva los distintos valores que vaya tomando del contador

// Iniciamos contadores
        contador = 1; // Iniciamos el contador a 1
        suma = 0;     // Iniciamos el acumulador a 0, para ir sumando todo lo que se vaya recorriendo

// Realizamos el recorrido
        while (contador <= 5) {  // Mientras contador no supere el valor 5...
            suma += contador; // En cada iteración: cumulamos en suma el valor de cada contador
            contador++;       // En cada iteración: incrementamos en 1 el contador 
        }

// Mostramos el resultado por pantalla
        System.out.println("La suma de los números entre 1 y 5 es " + suma);
    }
}
