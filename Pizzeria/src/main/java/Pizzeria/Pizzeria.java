/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Pizzeria;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Pizzeria {

    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza("Peperoni", "XL","Normal");
                     
        do{
            System.out.println("Bienvenido a Pizzería");
            System.out.println("1) Pizza Napolitana");
            System.out.println("2) Pizza Peperoni");
            System.out.println("3) Pizza Hawaiana");
            System.out.println("4) Cancelar pedido");
            System.out.println("5) Finalizar Compra");
            System.out.println("6) Salir");
            System.out.println("Seleccione una opción: ");
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Solicitó pizza Napolitana");
                    pizza1.setNombre("Napolitana");
                    System.out.println("Ingrese el tipo de masa: ");
                    pizza1.setMasa(teclado.next());
                    System.out.println("Ingrese tamaño: ");
                    pizza1.setTamano(teclado.next());
                    break;
                case 2:
                    System.out.println("Solicitó pizza Peperoni");
                case 3:
                    System.out.println("Solicitó pizza Hawaiana");
                case 4:
                    System.out.println("Pedido cancelado");
                    break;
                case 5:
                    System.out.println("Resumen de compra");
                case 6:
                    System.out.println("Adiós");
                default:
                    System.out.println("Opción incorrecta");
            }
                        
            /*
            if(opcion == 1) {
            System.out.println("Opción 1");
            }
            else if(opcion == 2) {
            System.out.println("Opción 2");
            }    
            else {
            System.out.println("otra cosa");
            }
            */
        }while(opcion != 0);
                
    }
}
