/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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

        int n1, n2, n3;

        System.out.println("Inserta el número 1");
        n1 = s.nextInt();
        System.out.println("Inserta el número 2");
        n2 = s.nextInt();
        System.out.println("Inserta el número 3");
        n3 = s.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("El menor es n1 que vale " +n1+ "." );
        } else {
            if (n2 < n1 && n2 < n3) {
                System.out.println("El menor es n2 que vale " +n2+ "." );
        } else {
                System.out.println("El menor es n3 que vale " +n3+ "." );
                }
        }
    }
}