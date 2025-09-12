/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplossubprogramas;

import java.util.Scanner;

/**
 *
 * @author christian
 */
public class SaludosNombre { 


    public static void main(String[] args) {
        
        saludar("Christian");

        String nombreUsuario = pedirNombre();
        
        saludar(nombreUsuario);
    }

    // Saludo pasado por parámetros.
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + ".");
    }

    //Nombre pedido al usuario por teclado y devuelto.
    public static String pedirNombre() {

        Scanner s = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String nombre = s.nextLine();
        return nombre;
    }
}
