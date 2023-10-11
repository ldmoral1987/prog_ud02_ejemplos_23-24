
package com.iestrassierra.condicionales;

/**
 * Aplicación para probar los diferentes ámbitos de las variables
 * 
 * @author Luis del Moral Martínez
 */
public class Ambito {

    public static void main(String[] args) {
        // Bloque principal (0)
        int num1;
        num1 = 10;

        System.out.println("En bloque principal (0)");
        System.out.println("num1= " + num1);
        System.out.println();
        {
            // Bloque 0.1
            System.out.println("En bloque 0.1");
            int num2;
            num1++;
            num2 = 20;
            System.out.println("num1= " + num1);
            System.out.println("num2= " + num2);
            System.out.println();
        }
        System.out.println("En bloque principal (0)");
        System.out.println("num1= " + num1);
        //System.out.println("num2= " + num2); // Error
        System.out.println();
        {
            // Bloque 0.2
            System.out.println("En bloque 0.2");
            int num2;
            num1++;
            num2 = 20;
            System.out.println("num1= " + num1);
            System.out.println("num2= " + num2);
            System.out.println();
            {
                // Bloque 0.2.1
                System.out.println("En bloque 0.2.1");
                int num3 = 30;
                num1++;
                num2++;
                System.out.println("num1= " + num1);
                System.out.println("num2= " + num2);
                System.out.println("num3= " + num3);
                System.out.println();
            }
            System.out.println("En bloque 0.2");
            System.out.println("num1= " + num1);
            System.out.println("num2= " + num2);
            //System.out.println("num3= " + num3);// Error
            System.out.println();
        }
        System.out.println("En bloque principal (0)");
        System.out.println("num1= " + num1);
        //System.out.println("num2= " + num2);// Error
        //System.out.println("num3= " + num3);// Error
        System.out.println();
    }
}
