
package com.iestrassierra.condicionales;

/**
 * Ejemplo de uso del switch
 * 
 * @author Luis del Moral Martínez
 */
public class CondicionalSwitch {
    
    /**
     * Vamos a realizar el cálculo de la nota de un examen de tipo test. Para
     * ello, tendremos en cuenta el número total de preguntas, los aciertos y
     * los errores. Dos errores anulan una respuesta correcta. La nota que vamos
     * a obtener será un número entero. Finalmente, se muestra por pantalla la
     * nota obtenida, así como su calificación no numérica. La obtención de
     * la calificación no numérica se ha realizado utilizando la estructura
     * condicional múltiple o switch.     
     */
    public static void main(String[] args) {
        
         // Declaración e inicialización de variables
        int numeroAciertos = 17;
        int numeroErrores = 3;
        int numeroPreguntas = 20;
        float nota = 0;
        int notaEntera = 0;
        String calificacion="";
    
        /* Paso 1: Calculo de la nota flotante.
           Nota: "2f" es un literal de número flotante, al introducirlo, 
                el conjunto de las operaciones se realizan con decimales. */
        nota = ((numeroAciertos - (numeroErrores/2f))*10f)/numeroPreguntas;
        
        /* Paso 2: Convertimos la nota flotante a entero.          
        Para esta conversión, usamos el método round de la clase Math cuyo
        objetivo es precisamente redondear un número flotante a entero. */
        
        notaEntera=Math.round(nota);
        
        /* Nota: la conversión de float a int se podrí­a haber hecho así­:
                notaEntera=(int)nota; 
           Pero la nota se hubiese truncado (eliminado la parte decimal),
           con lo que 8.2 serí­a 8 y 8.8 serí­a 8 también.*/
        
        
        /* Paso 3: Calculamos cual serí­a su calificación no numérica. */
        switch (notaEntera) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                calificacion = "INSUFICIENTE"; 
                break;		
            case 5:
                calificacion = "SUFICIENTE"; 
		break;
            case 6:
		calificacion = "BIEN";
		break;
            case 7:
            case 8:
                calificacion = "NOTABLE"; 
		break;
            case 9: 
            case 10:
		calificacion = "SOBRESALIENTE"; 
		break;
            default:
                System.out.println("Se ha introducido una nota errónea");
		calificacion = "CALIFICACIÓN FUERA DE RANGO";          
        }
        
        /* Paso 4: Mostramos la calificación obtenida y su equivalente no numérico. */
        System.out.println ("La nota obtenida es: " + nota);
        System.out.println ("Y la calificación obtenida es: " + calificacion);
    }  
}