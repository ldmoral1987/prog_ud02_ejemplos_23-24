
package com.iestrassierra.condicionales;

import java.util.Scanner;

/**
 * Aplicación con varios IF
 * 
 * @author Luis del Moral Martínez
 */
public class NotaCualitativa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int notaCuantitativa = teclado.nextInt(); // Lectura de un entero desde teclado
        String notaCualitativa = "";

        if (notaCuantitativa < 5) {
            notaCualitativa = "INSUFICIENTE";
        }
        if (notaCuantitativa >= 5 && notaCuantitativa < 6) {
            notaCualitativa = "SUFICIENTE";
        }
        if (notaCuantitativa >= 6 && notaCuantitativa < 7) {
            notaCualitativa = "BIEN";
        }
        if (notaCuantitativa >= 7 && notaCuantitativa < 9) {
            notaCualitativa = "NOTABLE";
        }
        if (notaCuantitativa >= 9 && notaCuantitativa <= 10) {
            notaCualitativa = "SOBRESALIENTE";
        }

        System.out.println("La calificación cualitativa equivalente es: " + notaCualitativa);
    }
}
