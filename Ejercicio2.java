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

        System.out.print("Escribe una frase: ");
        String frase = s.nextLine(); // La varuiable frase pertenece a la clase String y leeremos la siguiente linea.

        System.out.print("Escribe una letra: ");
        char letra = s.next().charAt(0); // Leemos una letra con chartAt para posicionarnos.

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) { 
                contador++;
                
            }
        }

         System.out.println("El número de letras " + letra + " en esa frase es: " + contador);
            }
     }

