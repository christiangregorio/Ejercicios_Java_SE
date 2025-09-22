/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Ejercicio9 {
    
    /* Escribir un proprama que pida al usuario que introduzca por teclado números enteros. 
    La lectura de números por teclado finaliza cuando se introduce un -25. 
    El programa mostrará cuántos números negativos y ceros se han introducido.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dato;
        int cont0 = 0;
        int contN = 0;
        do {
            System.out.println("Inserta un numero (-25 para salir): ");
            dato = leer.nextInt();
            if (dato == 0) {
                cont0++;
            }
            if (dato < 0) {
                contN++;
            }
        } while (dato != -25);
        System.out.println("El numero de ceros es: " + cont0);
        System.out.println("El numero de negativos es: " + contN);
    }
}
