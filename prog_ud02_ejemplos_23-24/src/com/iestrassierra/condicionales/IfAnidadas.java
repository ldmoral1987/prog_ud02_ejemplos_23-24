
package com.iestrassierra.condicionales;

/**
 * Uso de sentencias if anidadas
 * 
 * @author Luis del Moral Martínez
 */
public class IfAnidadas {

    public static void main(String[] args) {
        int x = 122;
        if (x % 2 == 0) {
            if (x > 100) {
                System.out.println("El número es par y superior a 100.");
            }
        }

        if (x % 2 == 0 && x > 100) {
            System.out.println("El número es par y superior a 100.");
        }
        if (x < 0) {  // El número es negativo
            System.out.println("El número es negativo.");
        } else {  // El número es cero o positivo
            if (x > 0) {  // El número es positivo
                System.out.println("El número es positivo.");
            } else {  // Si se ha llegado hasta aquÃ­ el número es obligatoriamente cero
                System.out.println("El número es cero.");
            }

        }
        
        //-------------

    }
}
