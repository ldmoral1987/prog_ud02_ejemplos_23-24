/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

/**
 *
 * @author luisnavarro
 */
public class Pruebas {

    public static void main(String[] args) {
        int i = 2, j=1;
        
        while (true) {
            i *= i;
            j++;
            if (j%100==0) System.out.println(i);
            //System.out.println(j++);
        }
    }

}
