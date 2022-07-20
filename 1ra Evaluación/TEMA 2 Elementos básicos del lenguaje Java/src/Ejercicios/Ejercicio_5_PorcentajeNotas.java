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
public class Ejercicio_5_PorcentajeNotas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Sobresalientes: ");
        int SB = teclado.nextInt();

        System.out.print("Notables: ");
        int N = teclado.nextInt();

        System.out.print("Aprobados: ");
        int A = teclado.nextInt();

        System.out.print("Suspensos: ");
        int S = teclado.nextInt();

        System.out.print("No presentados: ");
        int NP = teclado.nextInt();

        int suma = SB + N + A + S + NP;

        System.out.println("El total de numeros de alumnos es " + suma);
    }

}
