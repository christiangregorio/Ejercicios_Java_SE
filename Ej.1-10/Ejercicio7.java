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
public class Ejercicio7 {

    /* Crea un programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente, 
    y comprueba si la hora que indican es una hora válida.
    Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será mayor o igual que cero y menor que 24.
    El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos. */
    
    public static int pedirPositivo(String mensaje) {
        Scanner leer = new Scanner(System.in);
        int dato;
        do {
            System.out.println("Inserta " + mensaje);
            dato = leer.nextInt();
            if (dato < 0) {
                System.out.println("Tienes que darme un numero positivo");
            }
        } while (dato < 0);

        return dato;
    }

    public static boolean[] resultado(int h, int m, int s) {
        boolean[] r = new boolean[3];
        r[0] = (h < 24);
        r[1] = (m < 60);
        r[2] = (s < 60);
        return r;
    }

    public static void main(String[] args) {
        //"14:132:134"  -> Sería otra forma de pedirlo
        int h, m, s;
        h = pedirPositivo("la hora: ");
        m = pedirPositivo("los minutos: ");
        s = pedirPositivo("los segundos: ");
        boolean[] r = resultado(h, m, s);
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }

    }
}
