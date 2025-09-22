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
public class Ejercicio5 {

    public static void main(String[] args) {

        /*Solicita al usuario una letra, si inserta una a muestra 
        el número 7, si es una b, el 9, si es una c el 101 y si no es 
        ninguno de los tres, indícale que se ha equivocado de letra*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Inserta una letra: ");
        char letra = leer.nextLine().charAt(0);
        switch (letra) {
            case 'a':
                System.out.println("7");
                break;
            case 'b':
                System.out.println("9");
                break;
            case 'c':
                System.out.println("101");
                break;
            default:
                System.out.println("Te has equivocado de letra");
        }
    }
}
