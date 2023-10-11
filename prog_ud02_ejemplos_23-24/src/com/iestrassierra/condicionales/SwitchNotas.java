
package com.iestrassierra.condicionales;

import java.util.Scanner;

/**
 * Aplicaci�n uso switch para nota cualitativa
 * 
 * @author Luis del Moral Mart�nez
 */
public class SwitchNotas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un n�mero entero: ");
        int notaCuantitativa = teclado.nextInt(); // Lectura de un entero desde teclado
        String notaCualitativa = "";
        int numero = notaCuantitativa;
        switch (numero) {
            case 0:
                System.out.println("cero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            default:
                System.out.println("otro");
        }
        //-------
        if (numero == 1) {
            System.out.println("cero");
        } else if (numero == 2) {
            System.out.println("uno");
        } else if (numero == 3) {
            System.out.println("dos");
        } else {
            System.out.println("otro");
        }

        //--------
        String dia = teclado.nextLine(); // Lectura de un entero desde teclado
        String resultado = "";

        switch (dia) {
            case "lunes":
            case "martes":
            case "mi�rcoles":
            case "jueves":
            case "viernes":
                resultado = "d�a laborable";
                break;
            case "s�bado":
            case "domingo":
                resultado = "fin de semana";
                break;
            default:
                resultado = "d�a no v�lido";
        }

        if (dia.equals("lunes") || dia.equals("martes") || dia.equals("mi�rcoles") || dia.equals("jueves") || dia.equals("viernes")) {
            resultado = "d�a laborable";
        } else if (dia.equals("s�bado") || dia.equals("domingo")) {
            resultado = "fin de semana";
        } else {
            resultado = "d� no v�lido";
        }
    }
}
