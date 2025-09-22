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
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        /* Almacena en dos variables datos de validación (usuario y contraseña) correctos y 
        permite que el usuario valide (dispone de 3 intentos). */
        
        
        int intentos = 0;
        final String USERC = "admin";
        final String PASSC = "admin";
        final int INTENTOS_TOTALES = 3;
        String user, pass;
        do {
            System.out.println("Inserta el usuario: ");
            user = leer.nextLine();
            System.out.println("Inserta el password");
            pass = leer.nextLine();
            if (user.equals(USERC) && pass.equals(PASSC)) {
                System.out.println("Bienvenid@");
            } else {
                System.out.println("Error");
                intentos++;
            }
        } while ((!user.equals(USERC) || !pass.equals(PASSC))
                && intentos < INTENTOS_TOTALES);

        /*do{
            //pedir
        }while(comprobar);*/
    }
}
