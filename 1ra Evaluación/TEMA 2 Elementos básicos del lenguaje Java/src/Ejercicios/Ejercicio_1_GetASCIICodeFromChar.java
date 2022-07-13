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
public class Ejercicio_1_GetASCIICodeFromChar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un Caracter:  ");

        char caracter = teclado.nextLine().charAt(0);

        System.out.println("El caracter " + caracter + " que has introducido es: " + (int) caracter);
    }

}
