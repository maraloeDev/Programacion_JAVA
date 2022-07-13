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
public class Ejercicio_3_Calculo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");

        int num1 = teclado.nextInt();

        System.out.println("Introduce un número: ");

        int num2 = teclado.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int resto = num1 & num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multipicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.println("El resto es: " + resto);
    }

}
