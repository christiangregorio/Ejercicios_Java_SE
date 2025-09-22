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
public class Ejercicio10 {
    
    /* Programa para invertir el orden de las cifras de un número. 
    Se introduce un número entero positivo por teclado y el programa modifica el número invirtiendo el orden de sus cifras.
    Si por ejemplo se introduce el número N = 1234
    El programa lo transformará invirtiendo el orden de sus cifras. El nuevo valor de N será 4321 */

    public static int nCifras(int n) {
        int cont = 0;
        while (n / 10 > 0) {
            cont++;
            n = n / 10;
        }
        return cont + 1;
    }

    public static int multX10(int r, int veces) {
        for (int i = 0; i < veces; i++) {
            r *= 10; //r = r * 10
        }
        return r;
    }

    public static int invertir(int n) {
        int r = n % 10;//4
        r = multX10(r, nCifras(n) - 1);
        int r2 = (n / 10) % 10; //3 
        r2 = multX10(r2, nCifras(n) - 2);
        int r3 = ((n / 10) / 10) % 10; //2
        r3 = multX10(r3, nCifras(n) - 3);
        int r4 = (((n / 10) / 10) / 10) % 10; //1
        r4 = multX10(r4, nCifras(n) - 4);
        return (r + r2 + r3 + r4);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Inserta un numero: ");
        int n = leer.nextInt();
        /*System.out.println(n%10);//1234 => 1234%10 = 4
        //1234 => n/10 = 123 (n/10)%10 = 3
        //1234 % 100 = 34 
        //x%y => [0, (y-1)] 
        System.out.println((n/10)%10);
        System.out.println(((n/10)/10)%10);
        System.out.println((((n/10)/10)/10)%10);*/
        System.out.println(invertir(n));
    }
}
