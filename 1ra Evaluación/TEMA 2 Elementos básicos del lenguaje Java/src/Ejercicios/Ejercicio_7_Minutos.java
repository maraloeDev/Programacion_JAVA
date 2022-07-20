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
public class Ejercicio_7_Minutos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero de segundos ");

        int valor = teclado.nextInt();

        int minutos;
        int segundos;

        minutos = valor / 60;
        segundos = valor % 60;

        System.out.println(minutos + "m");
        System.out.println(segundos + "s");
    }
}
