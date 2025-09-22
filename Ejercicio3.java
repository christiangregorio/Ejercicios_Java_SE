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
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        // Suma o resta (según elija el usuario) dos números reales.

        double n1, n2;
        String operador;

        System.out.println("Inserta el primer número: ");
        n1 = s.nextDouble();

        do {
            System.out.println("Introduce el operador + ó - : ");
            operador = s.next();
        } while (!(operador.equals("+") || operador.equals("-")));

        System.out.println("Inserta el segundo número: ");
        n2 = s.nextDouble();

        if (operador.equals("+")) {
            System.out.println("Resultado de suma: " + (n1 + n2));

        } else if (operador.equals("-")) {
            System.out.println("Resultado de resta: " + (n1 - n2));
        }
    }
}

// Opción con resultado como variable:
// Si voy a usar la variable resultado más de una vez, puedo declararlo como double resultado al inicio
// y posteriormente en el if: resultado = n1 + n2, añadiendo en el println: + resultado
