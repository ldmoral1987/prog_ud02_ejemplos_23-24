
package com.iestrassierra.bucles;

import java.util.Scanner;

/**
 * Aplicaci�n contador intentos (adivinar un c�digo)
 * 
 * @author Luis del Moral Mart�nez
 */
public class ContadorIntentos {

    public static void main(String[] args) {
        // Declaraci�n de variables
        Scanner teclado = new Scanner(System.in);
        final int CODIGO = 6767;  // Constante que contiene el c�digo correcto
        int codigoIntroducido;    // C�digo introducio por el usuario
        int numIntentos = 0;      // Contador que representa el n�mero de intentos

        // Entrada de datos
        do {
            System.out.print("Introduzca c�digo (entre 0 y 9999): ");
            codigoIntroducido = teclado.nextInt();
            numIntentos++;
            if (codigoIntroducido != CODIGO) {
                System.out.println("C�digo incorrecto.");
            }
        } while (codigoIntroducido != CODIGO && numIntentos < 3); // Mientras el c�digo sea incorrecto y no hayamos llegado al l�mite de intentos

        // Comprobaci�n de c�digo correcto
        if (codigoIntroducido == CODIGO) {
            System.out.println("C�digo correcto. Acceso concedido.");
        } else {
            System.out.println("N�mero de intentos superado. Acceso bloqueado");
        }

    }
}
