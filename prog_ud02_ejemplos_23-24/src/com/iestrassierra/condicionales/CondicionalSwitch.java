
package com.iestrassierra.condicionales;

/**
 * Ejemplo de uso del switch
 * 
 * @author Luis del Moral Mart�nez
 */
public class CondicionalSwitch {
    
    /**
     * Vamos a realizar el c�lculo de la nota de un examen de tipo test. Para
     * ello, tendremos en cuenta el n�mero total de preguntas, los aciertos y
     * los errores. Dos errores anulan una respuesta correcta. La nota que vamos
     * a obtener ser� un n�mero entero. Finalmente, se muestra por pantalla la
     * nota obtenida, as� como su calificaci�n no num�rica. La obtenci�n de
     * la calificaci�n no num�rica se ha realizado utilizando la estructura
     * condicional m�ltiple o switch.     
     */
    public static void main(String[] args) {
        
         // Declaraci�n e inicializaci�n de variables
        int numeroAciertos = 17;
        int numeroErrores = 3;
        int numeroPreguntas = 20;
        float nota = 0;
        int notaEntera = 0;
        String calificacion="";
    
        /* Paso 1: Calculo de la nota flotante.
           Nota: "2f" es un literal de n�mero flotante, al introducirlo, 
                el conjunto de las operaciones se realizan con decimales. */
        nota = ((numeroAciertos - (numeroErrores/2f))*10f)/numeroPreguntas;
        
        /* Paso 2: Convertimos la nota flotante a entero.          
        Para esta conversi�n, usamos el m�todo round de la clase Math cuyo
        objetivo es precisamente redondear un n�mero flotante a entero. */
        
        notaEntera=Math.round(nota);
        
        /* Nota: la conversi�n de float a int se podr�a haber hecho as�:
                notaEntera=(int)nota; 
           Pero la nota se hubiese truncado (eliminado la parte decimal),
           con lo que 8.2 ser�a 8 y 8.8 ser�a 8 tambi�n.*/
        
        
        /* Paso 3: Calculamos cual ser�a su calificaci�n no num�rica. */
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
                System.out.println("Se ha introducido una nota err�nea");
		calificacion = "CALIFICACI�N FUERA DE RANGO";          
        }
        
        /* Paso 4: Mostramos la calificaci�n obtenida y su equivalente no num�rico. */
        System.out.println ("La nota obtenida es: " + nota);
        System.out.println ("Y la calificaci�n obtenida es: " + calificacion);
    }  
}