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
public class Ejercicio_2_GitCharFromASCIICode {

    public static void main(String[] args) {

        System.out.println("Introduce un número que lo convierto en caracter: ");

        Scanner teclado = new Scanner(System.in);

        double ASCII = teclado.nextDouble();

        System.out.println("El decimal: " + ASCII + " se asocia con el caracter: " + (char) ASCII);

    }

}
