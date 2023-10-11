
package com.iestrassierra.bucles;

import java.util.Scanner;

/**
 * Uso de while
 * 
 * @author Luis del Moral Mart�nez
 */
public class WhileSimple {

    public static void main(String[] args) {
        // Declaraci�n de variables
        Scanner teclado = new Scanner(System.in);
        int inicio, fin, numero;
        //Hagamos primero desde 1 hasta 5
        //De 1 a 10 de 2 en 2

        // Entrada de datos
        System.out.print("Introduzca el inicio: ");
        inicio = teclado.nextInt();

        System.out.print("Introduzca el fin: ");
        fin = teclado.nextInt();

        // Procesamiento y salida de resultados
        System.out.println("\nSecuencia de n�meros desde " + inicio + " hasta " + fin);
        numero = inicio;
        while (numero <= fin) {
            System.out.print(numero + " ");
            numero++;
        }
        System.out.println();

        //supongamos que quiere chekear que fin>ppo
        // Entrada de datos
        System.out.println("Debe introducir el incio y el fin.");
        System.out.println("Tenga en cuenta que el fin no debe ser menor que el inicio: ");
        System.out.print("Introduzca el inicio: ");
        inicio = teclado.nextInt();
        System.out.print("Introduzca el fin: ");
        fin = teclado.nextInt();

        while (inicio > fin) { // Si inicio es superior a fin hay que volver a solicitar
            System.out.println("Error: el fin no puede ser superior al inicio.");
            System.out.print("Introduzca el inicio: ");
            inicio = teclado.nextInt();
            System.out.print("Introduzca el fin: ");
            fin = teclado.nextInt();
        }
        System.out.println("Entrada correcta.");
    }
}
