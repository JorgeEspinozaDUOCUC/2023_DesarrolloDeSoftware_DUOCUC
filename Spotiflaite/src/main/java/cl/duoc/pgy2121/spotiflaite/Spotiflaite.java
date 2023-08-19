/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.pgy2121.spotiflaite;

/**
 *
 * @author cetecom
 */
public class Spotiflaite {
              
    public static void main(String[] args) {
        //tipos de datos en Java
        char sexo = 'M';//caracter (solo 1), se usa con comillas simples.
            String nombre = "Jorge"; //texto. Cadenas de caracteres. Se utiliza cn comillas dobles.
        boolean isValid = false; //valores booleanos. Binario
            byte bytes;//cadena de binarios. Se utiliza comunmente en robótica.
        int edad = 35; //números enteros
            float decimal = 3.14f; //da prioridad a decimales, por sobre los numéricos
            double doble = 3.10d; //solo 2 decimales. Da prioridad a los numéricos, por sobre los decimales
            long numeroLargo = 21889896498759489l; //números de muchos dígitos
            short numeroCorto = 12; //numero de pocos dígitos
        
        //Imprimir. se utiliza ln despues de print para realizar salto de linea.
        //escribir sout + tab
        //concatenar con +
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Verdadero o Falso: " + isValid);
    }
}
