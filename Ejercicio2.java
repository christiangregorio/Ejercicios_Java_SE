/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author christian
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Solicita al usuario una frase y una letra y muestra la cantidad de veces que aparece la letra en la frase.
        
        int contador = 0;
        // Tambiénn puedo declarar las variables String frase y char letra al principio como "String frase, char letra..." y mas tarde solo darles el valor como frase=... letra=... 

        System.out.print("Escribe una frase: ");
        String frase = s.nextLine(); // La varuiable frase pertenece a la clase String y leeremos la siguiente linea.

        System.out.print("Escribe una letra: ");
        char letra = s.next().charAt(0); // Leemos una letra con chartAt para posicionarnos.

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;

            }
        }

        System.out.println("El número de letras " + letra + " en esa frase es: " + contador);
    }
}
