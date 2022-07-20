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
public class Ejercicio__11_Celsius {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inttoduce un valor para f :");

        int f = teclado.nextInt();
        System.out.println("Inttoduce un valor para C :");

        int C = teclado.nextInt();

        int res = (f= (9 / 5) + C + 32);

        System.out.println("El resultado es " + res);
    }

}
