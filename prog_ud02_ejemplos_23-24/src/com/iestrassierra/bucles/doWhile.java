/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author luisnavarro
 */
public class doWhile {

    public static void main(String[] args) {
        // Declaración de variables
        Scanner teclado = new Scanner(System.in);
        int inicio, fin, numero;

// Entrada de datos
        System.out.print("Introduzca el inicio: ");
        inicio = teclado.nextInt();
        System.out.print("Introduzca el fin: ");
        fin = teclado.nextInt();

// Procesamiento y salida de resultados
        System.out.println("\nSecuencia de números desde " + inicio + " hasta " + fin);
        numero = inicio;
        do {
            System.out.print(numero + " ");
            numero++;
        } while (numero <= fin);
        System.out.println();
    }

}
