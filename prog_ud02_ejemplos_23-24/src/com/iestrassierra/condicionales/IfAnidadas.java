
package com.iestrassierra.condicionales;

/**
 * Uso de sentencias if anidadas
 * 
 * @author Luis del Moral Mart�nez
 */
public class IfAnidadas {

    public static void main(String[] args) {
        int x = 122;
        if (x % 2 == 0) {
            if (x > 100) {
                System.out.println("El n�mero es par y superior a 100.");
            }
        }

        if (x % 2 == 0 && x > 100) {
            System.out.println("El n�mero es par y superior a 100.");
        }
        if (x < 0) {  // El n�mero es negativo
            System.out.println("El n�mero es negativo.");
        } else {  // El n�mero es cero o positivo
            if (x > 0) {  // El n�mero es positivo
                System.out.println("El n�mero es positivo.");
            } else {  // Si se ha llegado hasta aquí el n�mero es obligatoriamente cero
                System.out.println("El n�mero es cero.");
            }

        }
        
        //-------------

    }
}
