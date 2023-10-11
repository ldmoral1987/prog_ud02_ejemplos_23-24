
package com.iestrassierra.condicionales;

/**
 * Uso de sentencias if simples
 * 
 * @author Luis del Moral Martínez
 */
public class IfSimple {

    public static void main(String[] args) {
        int valor = 0;
        System.out.println("El programa está ejecutándose."); // Esta lí­nea se ejecuta en cualquier caso
        
        if (valor < 0) 
        {
            System.out.println("El valor es negativo."); // Esta lí­nea solo se ejecuta si valor < 0
        }
        
        valor = 0; // Esta línea se ejecuta en cualquier caso
        System.out.println("El valor ha sido reseteado a cero."); // Esta lí­nea se ejecuta en cualquier caso
        System.out.println("El programa sigue ejecutándose."); // Esta lí­nea se ejecuta en cualquier caso
        
        if (valor % 2 == 0)  
        {
            // Si el resto de la divisiÃ³n entera entre 2 es cero, el nÃºmero es par
            System.out.println("El nÃºmero es par.");
        }
        else
        {
            // Si no, el nÃºmero es impar
            System.out.println("El nÃºmero es impar.");
        }
    }
}
