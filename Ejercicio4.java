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

        Scanner s = new Scanner(System.in);

        String usuario;
        String contrasenia;
        String usuarioCorrecto = "Christian";
        String contraseniaCorrecta = "1234";
        int intento = 0;

        do {
            System.out.print("Ingrese usuario: ");
            usuario = s.nextLine();

            System.out.print("Ingrese contraseña: ");
            contrasenia = s.nextLine();

            if (usuario.equals(usuarioCorrecto) && contrasenia.equals(contraseniaCorrecta)) {
                System.out.println("¡Usuario y contraseña correctos!");
                break;  // salir del bucle
            } else {
                System.out.println("Usuario o contraseña incorrectos.");
                intento++;
            }
        } while (intento < 3);

        if (intento == 3) {
            System.out.println("Se han agotado los 3 intentos.");
        }
    }

}

