/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Ejercicio_8_SentenciaLogica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número ");

        int num = teclado.nextInt();

        boolean f = false;
        boolean t = true;

        if (num < 0) {

            System.out.println("El numero es negativo " + f);
        } else if (num < 100) {
            System.out.println("El numero es positivo menor que 100 " + t);
        } else if (num >= 100) {
            System.out.println("El numero es Mayor o igual que 100 " + t);
        }
    }

}
