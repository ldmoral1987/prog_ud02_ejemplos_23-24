
package com.iestrassierra.bucles;

import java.util.Scanner;

/**
 * Aplicación contador intentos (adivinar un código)
 * 
 * @author Luis del Moral Martínez
 */
public class ContadorIntentos {

    public static void main(String[] args) {
        // Declaración de variables
        Scanner teclado = new Scanner(System.in);
        final int CODIGO = 6767;  // Constante que contiene el código correcto
        int codigoIntroducido;    // Código introducio por el usuario
        int numIntentos = 0;      // Contador que representa el número de intentos

        // Entrada de datos
        do {
            System.out.print("Introduzca código (entre 0 y 9999): ");
            codigoIntroducido = teclado.nextInt();
            numIntentos++;
            if (codigoIntroducido != CODIGO) {
                System.out.println("Código incorrecto.");
            }
        } while (codigoIntroducido != CODIGO && numIntentos < 3); // Mientras el código sea incorrecto y no hayamos llegado al límite de intentos

        // Comprobación de código correcto
        if (codigoIntroducido == CODIGO) {
            System.out.println("Código correcto. Acceso concedido.");
        } else {
            System.out.println("Número de intentos superado. Acceso bloqueado");
        }

    }
}
