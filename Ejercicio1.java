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
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //Solicita al usuario tres números enteros e indícale cuál es el menor.

        System.out.print("Inserta el numero 1: ");
        int n1 = s.nextInt();
        System.out.print("Inserta el numero 2: ");
        int n2 = s.nextInt();
        System.out.print("Inserta el numero 3: ");
        int n3 = s.nextInt();
        //Opción 1
        /*if (n1 == n2 && n1 == n3) {
            System.out.print("Son iguales");
        } else {*/
        if (n1 <= n2 && n1 <= n3) {//n1=2 n2=1 n3=1
            System.out.print("El menor es n1 que vale: " + n1 + ".");
        } else {
            if (n2 < n1 && n2 <= n3) {
                System.out.print("El menor es n2 que vale: " + n2 + ".");
            } else {
                System.out.print("El menor es n3 que vale: " + n3 + ".");
            }
        }

        //}
        
        //Opción 2
        /*if (n1 == n2 && n1 == n3) {
            System.out.print("Son iguales");
        }*/
    }
}