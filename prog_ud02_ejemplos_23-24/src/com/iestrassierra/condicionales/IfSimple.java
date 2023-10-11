
package com.iestrassierra.condicionales;

/**
 * Uso de sentencias if simples
 * 
 * @author Luis del Moral Mart�nez
 */
public class IfSimple {

    public static void main(String[] args) {
        int valor = 0;
        System.out.println("El programa est� ejecut�ndose."); // Esta l�nea se ejecuta en cualquier caso
        
        if (valor < 0) 
        {
            System.out.println("El valor es negativo."); // Esta l�nea solo se ejecuta si valor < 0
        }
        
        valor = 0; // Esta l�nea se ejecuta en cualquier caso
        System.out.println("El valor ha sido reseteado a cero."); // Esta l�nea se ejecuta en cualquier caso
        System.out.println("El programa sigue ejecut�ndose."); // Esta l�nea se ejecuta en cualquier caso
        
        if (valor % 2 == 0)  
        {
            // Si el resto de la división entera entre 2 es cero, el número es par
            System.out.println("El número es par.");
        }
        else
        {
            // Si no, el número es impar
            System.out.println("El número es impar.");
        }
    }
}
